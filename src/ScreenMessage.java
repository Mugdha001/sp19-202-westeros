import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScreenMessage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenMessage extends Actor
{
    /**
     * Act - do whatever the ScreenMessage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setRotation(90);
        move(1);
    }  
    
    public ScreenMessage(String message)
    {      
        GreenfootImage img = new GreenfootImage(700,500); 
        img.setFont(new Font("Perpetua", false, true,48));
        img.setColor(Color.RED);
        img.drawString(message,100,450);
        setImage(img);
    }
}
