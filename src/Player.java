import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor implements Observer
{
    private boolean spaceDown;
    private WeaponFactory wf;
    int castleHealth;
    int enemyHealth;
    int Xcoord;
    int Ycoord;
    ShootingStrategy currentShootingStrategy;
    Actor castle;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
    } 
    
    public void checkKeys()
    {
        if("space".equals(Greenfoot.getKey()))
        {
            doshoot();
        }
        if( Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
    }
    
    private void doshoot()
    {
        World world = getWorld();
        Xcoord = getX();
        Ycoord = getY();
        
        currentShootingStrategy.shoot(world, Xcoord, Ycoord);
    }
    
    
    public Player()
    {
        WeaponFactory wf = new PlayerBulletFactory();
        currentShootingStrategy = new SingleWeaponStrategy();
        castle = new Castle();
        castleHealth = 100;
  
        
    }
    
    public void updateStrategy()
    {
        currentShootingStrategy = new DoubleWeaponStrategy();
    }
    
   
    public void update(int castle , int enemy)
    {
        if(castle!= -1)
            this.castleHealth = castle;
        if(castleHealth <= 50)
            updateStrategy();
        
        if(enemy!= -1)
            this.enemyHealth = enemy;
            
    }
    
}
