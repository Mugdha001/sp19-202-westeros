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
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int enemyHealth;
    ArrayList<Observer> obs = new ArrayList<Observer>();
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
        move(3);
        
    }  
    
    public boolean atWorldEdge()
    {
        if(getX() < 100 || getX() > getWorld().getWidth() - 100){
            //System.out.println("At right");
            return true;
        }
        else
            return false;
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
