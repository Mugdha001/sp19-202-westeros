import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DragonGlass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DragonGlass extends Actor implements Weapon
{   
    private boolean spaceDown;
    private int strength=10 ;
    /**
     * Act - do whatever the DragonGlass wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5.0);
        remove();
    }  
    public void remove(){
        Actor enemy = getOneIntersectingObject(Enemy.class);
        Actor icebullet = getOneIntersectingObject(IceBullet.class);
        if(icebullet != null)
        {
            getWorld().addObject(new Firesplat(), getX(), getY() );
            getWorld().removeObject(this);
        }
        
        else if(enemy != null)
        {
            MyWorld w = (MyWorld)getWorld();
            Enemy e = w.getEnemy();
            e.setHealth(e.getHealth()-strength);
            getWorld().addObject(new Firesplat(), getX(), getY() );
            getWorld().removeObject(this);

        }
        else if(getX()==749||getX()==0||getY()==0||getY()==569)
        {
            getWorld().removeObject(this);
        }
    }
    
     public void move(double distance)
    {
        double angle = Math.toRadians( getRotation() ) + 1.5708 ;
        int x = (int) Math.round(getX() + Math.cos(angle) * distance);
        int y = (int) Math.round(getY() + Math.sin(angle) * distance);
        
        setLocation(x, y);
    }
    
    public int getStrength(){
        return strength ;
    }
}