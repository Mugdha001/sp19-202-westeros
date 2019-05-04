import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Firesplat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Firesplat extends Actor
{
    
    private int life = 5;
    
     /**
     * Act - do whatever the firesplat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Greenfoot.playSound("firesplat_sound.wav");
        life--;
        if(life == 0)
            remove();
    }   
    
    /**
     * remove object from world
     */
    public void remove()
    {
        getWorld().removeObject(this);
    }
    
    /**
     * Constructor
     */
    public Firesplat()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 10 , img.getHeight() - 10);
        setImage(img);
        //Greenfoot.playSound("EnemyImpact.mp3");
    }
}
