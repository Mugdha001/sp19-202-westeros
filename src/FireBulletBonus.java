import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireBonus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireBulletBonus extends Actor
{
    /**
     * Act - do whatever the FireBonus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        disappear();
    }  
    
    public FireBulletBonus(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 300 , img.getHeight() - 310);
        setImage(img);
    }
    
    public void disappear(){
        Actor player = getOneIntersectingObject(Player.class);
        if(player != null)
            getWorld().removeObject(this);
    }
}
