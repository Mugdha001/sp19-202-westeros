import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerAbsorb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerAbsorb extends Actor
{
    /**
     * Act - do whatever the PlayerAbsorb wants to do. This method is called whenever
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
    
    public PlayerAbsorb()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 100 , img.getHeight() - 100);
        setImage(img);
    }
}
