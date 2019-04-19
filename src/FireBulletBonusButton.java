import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireBulletBonusButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireBulletBonusButton extends Actor implements IBonusInvoker 
{
    IBonusCommand bonusCommand;
    
    public FireBulletBonusButton(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 300 , img.getHeight() - 310);
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
