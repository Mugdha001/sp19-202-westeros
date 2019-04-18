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
    ScoreBoard score = new ScoreBoard();
    Player player = new Player();
    Enemy enemy = new Enemy();
    ShootingStrategy sw = new SingleWeaponStrategy();
    ShootingStrategy dw = new DoubleWeaponStrategy();
    //Enemy e2 = new Enemy();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750,570,1); 
        prepare();
    }
    
    private void prepare()
    {
        GreenfootImage bg = new GreenfootImage("snow_background_2.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        addObject(castle ,370,100);
        
        addObject(player, 370, 275);
        
        addObject(enemy , 280 ,540);
        //addObject(e2 , 480 ,540);

        addObject(score , 740, 200);
        
        castle.attach(score);
        castle.attach(player);
        enemy.attach(score);
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
