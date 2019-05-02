import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Actor implements Observer
{
    private boolean spaceDown;
    private WeaponFactory currentWeaponFactory; // what is this doing????????
    int castleHealth;
    int enemyHealth;
    int Xcoord;
    int Ycoord;
    ShootingStrategy currentShootingStrategy;
    private FireBulletBonusButton fireBulletBonusButton;
    private DragonGlassBonusButton dragonGlassBonusButton;
    private DefaultBulletButton defaultBulletButton;

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
        if(castleHealth <= 50)
            updateStrategy();
        currentShootingStrategy.shoot(world, currentWeaponFactory, Xcoord, Ycoord);
    }
    
    
    public Player2()
    {
        weaponFactoryList = new ArrayList<WeaponFactory>();
        currentWeaponFactory = new PlayerBulletFactory();
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
      

        if(enemy!= -1)
            this.enemyHealth = enemy;
            
    }
    
     private void collectBonus(){
        Actor dragonGlassBonus = getOneIntersectingObject(DragonGlassBonus.class);
        Actor fireBonus = getOneIntersectingObject(FireBulletBonus.class);
        if(fireBonus != null){
            getWorld().addObject(defaultBulletButton, 55, 45);
            getWorld().addObject(new BonusMenuInstruction("d"), 230, 175);
            
            getWorld().addObject(fireBulletBonusButton, 55, 80);
            getWorld().addObject(new BonusMenuInstruction("a"), 230, 210);
        }
        if(dragonGlassBonus != null){
            getWorld().addObject(dragonGlassBonusButton, 55, 120);
            getWorld().addObject(new BonusMenuInstruction("s"), 230, 250);
        }
        
        
    }
    
    public void setFireBulletMenuInvoker(FireBulletBonusButton bonusInvoker){
        fireBulletBonusButton = bonusInvoker;
    }
    
    public void setDragonGlassMenuInvoker(DragonGlassBonusButton bonusInvoker){
        dragonGlassBonusButton = bonusInvoker;
    }
    
    public void setDefaultBulletMenuInvoker(DefaultBulletButton bonusInvoker){
        defaultBulletButton = bonusInvoker;
    }
    public void setCurrentWeaponFactory(WeaponFactory wf){
        currentWeaponFactory = wf;
    }
    
}