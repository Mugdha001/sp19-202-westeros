import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Targeryn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wolf extends Actor
{
    /**
     * Act - do whatever the Targeryn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    }  
    
    public Wolf()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 320 , img.getHeight() - 370);
        setImage(img);
    }

}
