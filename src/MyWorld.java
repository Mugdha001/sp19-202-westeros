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
    //TrialStrategy trialStrategy = new TrialStrategy();
    ScoreBoard score = new ScoreBoard();
    Player player = new Player();
    Enemy enemy = new Enemy();
    ShootingStrategy sw = new SingleWeaponStrategy();
    ShootingStrategy dw = new DoubleWeaponStrategy();
    public int iceBulletSpeed;
    private int currentLevel;
    //Enemy e2 = new Enemy();
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
        GreenfootImage bg = new GreenfootImage("snow_background_2.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        addObject(castle ,370,100);
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
                     iceBulletSpeed = 8;
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
