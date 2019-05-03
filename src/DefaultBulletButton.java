import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DragonGlassBonusButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DefaultBulletButton extends Actor implements IBonusInvoker
{
    IBonusCommand bonusCommand;
    String key;
    
    /**
     * Constructor
     */
    public DefaultBulletButton(){
        key = "d";
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 50 , img.getHeight() - 50);
        setImage(img);
    }
    
    /**
     * Act method
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown(key))
        {
            keyPressed();
        }
    }  
    
    /**
     * execute if key is pressed
     */
    public void keyPressed(){
        bonusCommand.execute();
    }
    
    /**
     * cmd: map cmd to invoker
     */
    public void setCommand(IBonusCommand cmd){
        bonusCommand = cmd;
    }    
}
