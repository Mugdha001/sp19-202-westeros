import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TransitionScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TransitionScreen extends Actor
{
    /**
     * Act - do whatever the TransitionScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String message = "";
    CrossedSwords cs = new CrossedSwords();
    public void act() 
    {
        blink();
    }
    
    public TransitionScreen(String text)
    {
        GreenfootImage img = getImage();
        img.scale(750,570);
        message = text;
        img.setFont(new Font("Perpetua",false,true,48));
        img.setColor(Color.RED);
        img.drawString(message,160,335);
        setImage(img);
    }
    
    public void blink()
    {
        int count = 10000;
        while(count!=0)
        {
            GreenfootImage img = getImage();
            int t = img.getTransparency();
            Greenfoot.delay(25);
            img.setTransparency(0);
            Greenfoot.delay(25);
            img.setTransparency(t);
            count--;
        }

    }
    
    
    
    
    
}
