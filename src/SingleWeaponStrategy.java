import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SingleWeaponStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SingleWeaponStrategy implements IShootingStrategy
{
    /**
     * Constructor for objects of class SingleWeaponStrategy
     */
    public SingleWeaponStrategy()
    {
    }

    /**
     * shoot method
     * world: world
     * currentWeaponFactory: current Weapon Factory
     * Xcoord: x coordinate
     * Ycoord: y coordinate
     */
    public void shoot(World world,WeaponFactory currentWeaponFactory, int Xcoord, int Ycoord)
    {
        //PlayerBullet playerbullet = new PlayerBullet();
       if(world != null)
            world.addObject(currentWeaponFactory.getWeapon(), Xcoord, Ycoord);
    }
}
