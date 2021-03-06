import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DragonGlassBonusButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DragonGlassBonusButton extends Actor implements IBonusInvoker
{
    IBonusCommand bonusCommand;
    String key;
    
    /**
     * Constructor
     */
    public DragonGlassBonusButton(){
        key = "s";
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 421 , img.getHeight() - 421);
        setImage(img);
    }
    
    /**
     * act method
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown(key))
        {
            keyPressed();
        }
    }  
    
    /**
     * check key press
     */
    public void keyPressed(){
        bonusCommand.execute();
    }
    
    /**
     * cmd: command to be mapped to invoker
     */
    public void setCommand(IBonusCommand cmd){
        bonusCommand = cmd;
    }    
}
