import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

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
    private ArrayList<WeaponFactory> weaponFactoryList;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        collectBonus();
    } 
    
    public void checkKeys()
    {
        if("space".equals(Greenfoot.getKey()))
        {
            doshoot();
        }
        if( Greenfoot.isKeyDown("left"))
        {
            move(-7);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(7);
        }
    }
    
    private void doshoot()
    {
        World world = getWorld();
        Xcoord = getX();
        Ycoord = getY();
        //if(castleHealth <= 50)
          //  updateStrategy();
        currentShootingStrategy.shoot(world, Xcoord, Ycoord);
    }
    
    
    public Player()
    {
        weaponFactoryList = new ArrayList<WeaponFactory>();
        WeaponFactory wf = new PlayerBulletFactory();
        currentShootingStrategy = new SingleWeaponStrategy();
        castle = new Castle();
        castleHealth = 100;   
    }
    
    public void updateStrategy()
    {
        currentShootingStrategy = new SingleWeaponStrategy();
    }
    
   
    public void update(int castle , int enemy)
    {
        if(castle!= -1)
            this.castleHealth = castle;
      

        if(enemy!= -1)
            this.enemyHealth = enemy;
            
    }
    
     private void collectBonus(){
        Actor dragonGlassBonus = getOneIntersectingObject(DragonGlassBonus.class);
        Actor fireBonus = getOneIntersectingObject(FireBulletBonus.class);
        if(dragonGlassBonus != null){
            weaponFactoryList.add(new DragonGlassFactory());
        }
        
        if(fireBonus != null){
            weaponFactoryList.add(new FireBulletFactory());
        }
    }
    
}
