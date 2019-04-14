import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoubleWeaponStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleWeaponStrategy extends Actor implements ShootingStrategy 
{
    /**
     * Constructor for objects of class DoubleWeaponStrategy
     */
    private int timebetweenshots = 5;
    public DoubleWeaponStrategy()
    {
    }

    
    public void shoot(World world, int Xcoord, int Ycoord)
    {
        //PlayerBullet playerbullet = new PlayerBullet();
       if(world != null)
            world.addObject(new PlayerBullet(), Xcoord, Ycoord);
       for(timebetweenshots = 5; timebetweenshots <= 1000; timebetweenshots++)
        {}
       world.addObject(new PlayerBullet(), Xcoord, Ycoord);
       timebetweenshots = 5;
    }
}
