import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerBullet extends Actor
{
    private boolean spaceDown;
    /**
     * Act - do whatever the PlayerBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    }  
    
    
    
    public PlayerBullet()
    {
        spaceDown = false;
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 45 , img.getHeight() - 45);
        setImage(img);
    }
}
