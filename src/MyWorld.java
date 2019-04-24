import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Castle castle = new Castle();
    // command pattern starts
    IBonusCommand fireBulletBonusCommand = new BonusCommand();
    IBonusCommand dragonGlassBonusCommand = new BonusCommand();
    IBonusCommand defaultBulletCommand = new BonusCommand();
    FireBulletBonusButton fireBulletBonusButton = new FireBulletBonusButton();
    DragonGlassBonusButton dragonGlassBonusButton = new DragonGlassBonusButton();
    DefaultBulletButton defaultBulletButton = new DefaultBulletButton();
    BonusWeaponsMenu bonusWeaponsMenu = new BonusWeaponsMenu();
    //command pattern ends
    ScoreBoard score = new ScoreBoard();
    Player player = new Player();
    Enemy enemy = new Enemy();
    Enemy anotherEnemy = new Enemy();
    ShootingStrategy sw = new SingleWeaponStrategy();
    ShootingStrategy dw = new DoubleWeaponStrategy();
    public int iceBulletSpeed;
    private int currentLevel;
    
    public MyWorld()
    {     
        this(1);
    }
    
    public MyWorld(int level)
    {    
        super(750,570,1); 
        currentLevel = level;
        prepare();
    }
    
    public int getIceBulletSpeed()
    {
        return iceBulletSpeed;
    }
    
    public int getCurrentLevel()
    {
        return currentLevel;
    }
    
    private void prepare()
    {
        //command pattern starts
         setupCommandPatternForBonusWeapons();
        
        //dragon glass bonus

         //map command to invoker
         dragonGlassBonusButton.setCommand(dragonGlassBonusCommand);
         //map receiver to command
         dragonGlassBonusCommand.setReceiver(
          new IBonusReceiver() {
        	  
              /** Command Action */
              public void doAction() {
                  player.setCurrentWeaponFactory( new DragonGlassFactory() ) ;
              }
        }
        ) ;
        player.setDragonGlassMenuInvoker(dragonGlassBonusButton);
        
        
       addObject(bonusWeaponsMenu , 150, 150);
        //command pattern ends
        GreenfootImage bg = new GreenfootImage("snow_background_21.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        addObject(castle ,370,170);
        addObject(player, 370, 275);
        addObject(enemy , 370 ,540);
        addObject(score , 740, 200);
        castle.attach(score);
        castle.attach(player);
        enemy.attach(score);
        
        switch(currentLevel)
        {
            case 1 : iceBulletSpeed = 5;
                    break;
            
            case 2 : //set speed // add extra enemy //set whitewalker lives
                     addObject(anotherEnemy ,420 ,540);
                     enemy.setHealth(200);
                     anotherEnemy.setHealth(200);
                     iceBulletSpeed = 5;
                     break;
        }
        
        
    }
    
    public void setupCommandPatternForBonusWeapons(){
        
        // Default Bullet weapon
        //map command to invoker
         defaultBulletButton.setCommand(defaultBulletCommand);
         //map receiver to command
         defaultBulletCommand.setReceiver(
          new IBonusReceiver() {
        	  
              /** Command Action */
              public void doAction() {
                  player.setCurrentWeaponFactory( new PlayerBulletFactory() ) ;
              }
        }
        ) ;
        player.setDefaultBulletMenuInvoker(defaultBulletButton);
        
        
          //fire bullet bonus

         //map command to invoker
         fireBulletBonusButton.setCommand(fireBulletBonusCommand);
         //map receiver to command
         fireBulletBonusCommand.setReceiver(
          new IBonusReceiver() {
        	  
              /** Command Action */
              public void doAction() {
                  player.setCurrentWeaponFactory( new FireBulletFactory() ) ;
              }
        }
        ) ;
        player.setFireBulletMenuInvoker(fireBulletBonusButton);
    }
    
    public Castle getCastle()
    {
        return castle;
    }
    
    public ScoreBoard getScore()
    {
        return score;
    }
    
    public Enemy getEnemy()
    {
        return enemy;
    }
    

}
