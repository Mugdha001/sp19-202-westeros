import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private boolean spaceDown;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
    } 
    
    public void checkKeys()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            shoot();
        }
        if( Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
    }
    
    public void shoot()
    {
        
    }
    
    
    public Player()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 180 , img.getHeight() - 270);
        setImage(img);
    }
    
}
