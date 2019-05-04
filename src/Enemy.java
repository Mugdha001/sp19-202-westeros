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
    private int timebetweenshots = 0;
    private int enemySpeed = 1;
    int enemyHealth;
    ArrayList<Observer> obs = new ArrayList<Observer>();
    
    /**
     * Constructor parameterized
     */
    public Enemy(int speed){
        enemySpeed = speed;
    }
    

    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if(timebetweenshots % 100 == 0)
            shoot();
        timebetweenshots++;
        if(timebetweenshots == 1000)
            timebetweenshots = 0;
        if(atWorldEdge()){
            randomMoveEnemy();
        }
        move(enemySpeed);
        
    }  
    
    /**
     * check edges
     */
    public boolean atWorldEdge()
    {
        if(getX() < 100 || getX() > getWorld().getWidth() - 100){
            return true;
        }
        else
            return false;
    }
    
    /**
     * shoot
     */
    public void shoot()
    {
        IceBullet icebullet = new IceBullet();
        getWorld().addObject(icebullet, getX(), getY());
    }
    
    /**
     * Constructor
     */
    public Enemy()
    {
        enemyHealth = 100;
    }
    
    /**
     * o: attach observer
     */
    public void attach(Observer o)
    {
        obs.add(o);
    }
    
    /**
     * castleHealth: notify changes in castleHealth
     * enemyHealth: notify changes in enemyHealth
     */
    public void notifyObservers(int castleHealth, int enemyHealth )
    {
        for(Observer o : obs)
            o.update(-1,enemyHealth);
    }

    /**
     * value: enemy health value
     */
    public void setHealth(int value)
    {
        this.enemyHealth = value;
        notifyObservers(-1, this.enemyHealth);
    }
    
    /**
     * int: health value
     */
    public int getHealth()
    {
        return enemyHealth;
    }
    
    /**
     * random movement of enemy
     */
    public void randomMoveEnemy(){
         if (getX() <= getWorld().getWidth() -2 && getX()>100) {
         setLocation(getX() - 2, getY());
         turn(180);         
         setImage("nightking.png");  
     }  
     else if (getX() <=100)  {
         setLocation(getX() + 10, getY());  
         turn(180);
         setImage("nightkingupright.png");
      }
    }
}
