import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class clouds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clouds extends Actor
{
    /**
     * Act - do whatever the clouds wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //private static final double scrollSpeed = 2.5;
    //private int scrollPosition = 0;
    public void act() 
    {
        // Add your action code here.
        //scrollPosition -= scrollSpeed;
        //while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        //while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        //paint(scrollPosition);
        move(1);
        
        
        
    }    
}
