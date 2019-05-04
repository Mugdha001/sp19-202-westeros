import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snowsplat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snowsplat extends Actor
{
    
    private int life = 3;
    /**
     * Act - do whatever the snowsplat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       life--;
        if(life == 0)
            remove(); 
    }  
    
    /**
     * remove object from world
     */
    public void remove()
    {
        getWorld().removeObject(this);
    }
}
