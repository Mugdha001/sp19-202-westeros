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
    
    //command pattern
    //observer pattern setup
    //setup levels
    
    GreenfootSound backgroundMusic = new GreenfootSound("backgroundMusic.mp3");
    Castle castle = new Castle();
    Mediator mediator = new Mediator();
    ScoreBoard score = new ScoreBoard();
    CastleScoreboard castleScoreboard = new CastleScoreboard();
    EnemyScoreboard enemyScoreboard = new EnemyScoreboard();
    Player player = new Player();
    Player2 player2 = new Player2();
    Enemy enemy = new Enemy();
    Enemy anotherEnemy = new Enemy();
    Enemy level3Enemy = new Enemy();
    BonusWeaponsMenu bonusWeaponsMenu = new BonusWeaponsMenu();
    
    ShootingStrategy sw = new SingleWeaponStrategy();
    ShootingStrategy dw = new DoubleWeaponStrategy();
    public int iceBulletSpeed;
    private int currentLevel = 0;

    private void setup()
    {
        GreenfootImage bg = new GreenfootImage("welcomescreen.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        addObject(new Button("Start") , 240,200);
        addObject(new Button("Quit") , 240,265);
        addObject(new Button("Help") , 240,330);
        addObject(new GameTitle() , 380,70);
        addObject(new Wolf(), 60,100);
        addObject(new Wolf(), 690,100);
    }
    
    public MyWorld()
    {   
        this(0);
    }
    
    public MyWorld(int level)
    {    
        super(750,570,1); 
        //backgroundMusic.playLoop();
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
        mediator.setCommandPattern(player);
        if(currentLevel == 0)
        {
            setup();
            return;
        }
        
        //command pattern ends
        GreenfootImage bg = new GreenfootImage("snowy.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        //addObject(backgroundScore , 150,0);
        addObject(bonusWeaponsMenu , 150, 150);
        addObject(score , 740, 93);
        addObject(castle ,370,170);
        addObject(player, 370, 275);
        addObject(enemy , 370 ,540);
        addObject(castleScoreboard , 559 ,41);
        addObject(enemyScoreboard , 638 ,53);
       
        TreeRegistry.loadRegistry();
        addObject(TreeRegistry.getTree(1), 59, 311);
        addObject(TreeRegistry.getTree(2), 35, 467);
        addObject(TreeRegistry.getTree(2), 696, 341);
        addObject(TreeRegistry.getTree(3), 168, 293);
        addObject(TreeRegistry.getTree(4), 118, 423);
        
       
        castle.attach(score);
        castle.attach(player);
        enemy.attach(score);
        
        switch(currentLevel)
        {
            case 1 : iceBulletSpeed = 5;
                    break;
            
            case 2 : //set speed // add extra enemy //set whitewalker lives
                     addObject(anotherEnemy ,105 ,540);
                     enemy.setHealth(200);
                     anotherEnemy.setHealth(200);
                     iceBulletSpeed = 5;
                     break;
                     
            case 3 : addObject(level3Enemy ,105 ,540);
                     addObject(anotherEnemy ,205 ,540);
                     enemy.setHealth(200);
                     anotherEnemy.setHealth(200);
                     iceBulletSpeed = 5;
                     break;
                     
       
        }
        
        
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
