import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IceBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IceBullet extends Actor
{
    /**
     * Act - do whatever the IceBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    
    public IceBullet()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 5 , img.getHeight() - 5);
        setImage(img);
    }
}
