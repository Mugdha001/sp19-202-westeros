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
    
    public void attach(Observer o)
    {
        obs.add(o);
    }
    
    public void notifyObservers(int castleHealth, int enemyHealth )
    {
        for(Observer o : obs)
            o.update(castleHealth,-1);
    }

    public Castle()
    {
        castleHealth = 100;
    }
    
    public void setHealth(int value)
    {
        this.castleHealth = value;
        notifyObservers(this.castleHealth , -1);
    }
    
    public int getHealth()
    {
        return castleHealth;
    }
 
}
