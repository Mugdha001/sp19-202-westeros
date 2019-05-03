import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerAbsorb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerAbsorb extends Actor
{
    
    private int life = 5;
    
    /**
     * Act - do whatever the PlayerAbsorb wants to do. This method is called whenever
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
    
    /**
     * absorb ice bullet
     */
    public PlayerAbsorb()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 180 , img.getHeight() - 180);
        setImage(img);
    }
}
