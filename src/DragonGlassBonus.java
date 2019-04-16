import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DragonGlassCoin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DragonGlassBonus extends Actor{
    /**
     * Act - do whatever the DragonGlassCoin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       disappear();
    }    
    public DragonGlassBonus(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 480 , img.getHeight() - 480);
        setImage(img);
    }
    
    public void disappear(){
        Actor player = getOneIntersectingObject(Player.class);
        if(player != null)
            getWorld().removeObject(this);
    }
}
