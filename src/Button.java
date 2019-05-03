import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String function = "";
    CrossedSwords cs = new CrossedSwords();
    public void act() 
    {
        //check mouse activity
        
        if(Greenfoot.mouseMoved(this))
        {
            getWorld().addObject(cs,getX()+100,getY());
        }
        else
        {
            getWorld().removeObject(cs);
        }
        
        if(Greenfoot.mousePressed(this) && function == "Start")
        {
            Greenfoot.setWorld(new MyWorld(1)); 
            Greenfoot.playSound("Respawn.mp3");
        }
        else if(Greenfoot.mousePressed(this) && function == "Help")
        {
            Greenfoot.setWorld(new Help()); 
            Greenfoot.playSound("Respawn.mp3");
        }
        else if(Greenfoot.mousePressed(this) && function == "Back")
        {
            Greenfoot.setWorld(new MyWorld(0));
            Greenfoot.playSound("Respawn.mp3");
        }
        else if(Greenfoot.mousePressed(this))
        {
            Greenfoot.playSound("Respawn.mp3");
        }
    
    }  
    
    /**
     * text: create button with text
     * Button: created button
     */
    public Button(String text)
    {
        function = text;
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 475 , img.getHeight() - 260);
        img.setFont(new Font("Perpetua",false,true,24));
        img.setColor(Color.CYAN);
        img.drawString(function,60,35);
        setImage(img);
        
        
    }
    
    /**
     * value: value
     */
    public void setFunction(String value)
    {
        function = value;
    }
}
