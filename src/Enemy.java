import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor implements Subject
{
    private int life = 0;
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int enemyHealth;
    ArrayList<Observer> obs = new ArrayList<Observer>();
    public void act() 
    {
        // Add your action code here.
        if(life % 100 == 0)
            shoot();
        life++;
        if(life == 1000)
            life = 0;
    }    
    
    public void shoot()
    {
        IceBullet icebullet = new IceBullet();
        getWorld().addObject(icebullet, getX(), getY());
    }
    
    public Enemy()
    {
        enemyHealth = 100;
    }
    
    public void attach(Observer o)
    {
        obs.add(o);
    }
    
    public void notifyObservers(int castleHealth, int enemyHealth )
    {
        for(Observer o : obs)
            o.update(-1,enemyHealth);
    }

    
    public void setHealth(int value)
    {
        this.enemyHealth = value;
        notifyObservers(-1, this.enemyHealth);
    }
    
    public int getHealth()
    {
        return enemyHealth;
    }
}
