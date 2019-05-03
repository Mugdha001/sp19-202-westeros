import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Castle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Castle extends Actor implements Subject
{
    ArrayList<Observer> obs = new ArrayList<Observer>();
    int castleHealth;
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    /**
     * o: observer to be attached
     */
    public void attach(Observer o)
    {
        obs.add(o);
    }
    
    /**
     * castleHealth: notify change in castleHealth
     * enemyHealth: notify change in enemyHealth
     */
    public void notifyObservers(int castleHealth, int enemyHealth )
    {
        for(Observer o : obs)
            o.update(castleHealth,-1);
    }

    /**
     * Constructor
     */
    public Castle()
    {
        castleHealth = 100;
    }
    
    /**
     * value: health value
     */
    public void setHealth(int value)
    {
        this.castleHealth = value;
        notifyObservers(this.castleHealth , -1);
    }
    
    /**
     * get health value
     */
    public int getHealth()
    {
        return castleHealth;
    }
    
}
