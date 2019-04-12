import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class firesplat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Firesplat extends Actor
{
    /**
     * Act - do whatever the firesplat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int life = 5;
    public void act() 
    {
        // Add your action code here.
       
        Greenfoot.playSound("firesplat_sound.wav");
        life--;
        if(life == 0)
            remove();
    }   
    
    public void remove()
    {
        getWorld().removeObject(this);
    }
}
