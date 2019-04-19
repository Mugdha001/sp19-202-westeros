import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DragonGlassBonusButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DragonGlassBonusButton extends Actor
{
    IBonusCommand bonusCommand;
    
    public DragonGlassBonusButton(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 408 , img.getHeight() - 408);
        setImage(img);
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("a"))
        {
            click();
        }
    }  
    
    public void click(){
        bonusCommand.execute();
    }
    
    public void setCommand(IBonusCommand cmd){
        bonusCommand = cmd;
    }    
}
