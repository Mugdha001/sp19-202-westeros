import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyRespawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyRespawn extends Actor
{
    private int life = 10;
    /**
     * Act - do whatever the EnemyRespawn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        life--;
        if(life == 0)
            remove(); 
    }  
    
    /**
     * Constructor
     */
    public EnemyRespawn()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 100 , img.getHeight() - 100);
        setImage(img);
        Greenfoot.playSound("Respawn.mp3");
    }
    
    /**
     * remove object from world
     */
    public void remove()
    {
        getWorld().removeObject(this);
    }
 
}
