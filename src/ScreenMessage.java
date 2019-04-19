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
    //private String message;
    
    public void act() 
    {
        blink();
    }  
    
    public ScreenMessage(String message)
    {      
        GreenfootImage img = new GreenfootImage(700,500); 
        img.setFont(new Font("Perpetua", false, true,48));
        img.setColor(Color.RED);
        img.drawString(message,100,450);
        setImage(img);
    }
    
    public void blink()
    {
        int count = 10;
        while(count!=0)
        {
            GreenfootImage img = getImage();
            int t = img.getTransparency();
            Greenfoot.delay(5);
            img.setTransparency(0);
            Greenfoot.delay(5);
            img.setTransparency(t);
            count--;
        }
    }
}
