import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snowsplat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snowsplat extends Actor
{
    /**
     * Act - do whatever the snowsplat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int life = 5;
    public void act() 
    {
       life--;
        if(life == 0)
            remove(); 
    }  
    public void remove()
    {
        getWorld().removeObject(this);
    }
}
