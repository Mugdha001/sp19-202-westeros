import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyRespawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyRespawn extends Actor
{
    /**
     * Act - do whatever the EnemyRespawn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int life = 10;
    public void act() 
    {
        life--;
        if(life == 0)
            remove(); 
    }  
    
    public EnemyRespawn()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 100 , img.getHeight() - 100);
        setImage(img);
        Greenfoot.playSound("Respawn.mp3");
    }
    
    public void remove()
    {
        getWorld().removeObject(this);
    }
 
}
