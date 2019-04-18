import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SingleWeaponStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SingleWeaponStrategy implements ShootingStrategy
{
    /**
     * Constructor for objects of class SingleWeaponStrategy
     */
    public SingleWeaponStrategy()
    {
    }

  
    public void shoot(World world, int Xcoord, int Ycoord)
    {
        //PlayerBullet playerbullet = new PlayerBullet();
        if(world != null)
            world.addObject(new PlayerBullet(), Xcoord, Ycoord);
    }
}
