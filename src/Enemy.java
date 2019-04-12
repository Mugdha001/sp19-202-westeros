import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private int life = 0;
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(life % 100 == 0)
            shoot();
        life++;
        if(life == 1000)
            life = 0;
    }    
    
    public void shoot()
    {
        IceBullet icebullet = new IceBullet();
        getWorld().addObject(icebullet, getX(), getY());
    }
}
