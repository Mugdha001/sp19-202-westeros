import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerBullet extends Mover
{
    private boolean spaceDown;
    /**
     * Act - do whatever the PlayerBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
 
        move(5.0);
        remove();
    }  
    
    public void remove()
    {
        Actor enemy = getOneIntersectingObject(Enemy.class);
        Actor icebullet = getOneIntersectingObject(IceBullet.class);
        if((enemy != null) || (icebullet != null))
        {
            getWorld().addObject(new Firesplat(), getX(), getY() );
            getWorld().removeObject(this);
        }
        else
        {
            if(getX()==749||getX()==0||getY()==0||getY()==499)
            {
                getWorld().removeObject(this);
            }
        }
    }
    
    public PlayerBullet()
    {
        spaceDown = false;
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 45 , img.getHeight() - 45);
        setImage(img);
    }
    
    public void move(double distance)
    {
        double angle = Math.toRadians( getRotation() ) + 1.5708 ;
        int x = (int) Math.round(getX() + Math.cos(angle) * distance);
        int y = (int) Math.round(getY() + Math.sin(angle) * distance);
        
        setLocation(x, y);
    }
    
}
