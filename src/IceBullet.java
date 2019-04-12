import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IceBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IceBullet extends Actor
{
    /**
     * Act - do whatever the IceBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(5.0);
        remove();
    }   
    
    public IceBullet()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 5 , img.getHeight() - 5);
        setImage(img);
    }
    
    public void remove()
    {
        Actor player = getOneIntersectingObject(Player.class);
        Actor castle = getOneIntersectingObject(Castle.class);
        Actor playerbullet = getOneIntersectingObject(PlayerBullet.class);
        if((player != null) || (castle != null) || (playerbullet != null))
        {
            getWorld().addObject(new Snowsplat(), getX(), getY() );
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
    
    public void move(double distance)
    {
        double angle = Math.toRadians( getRotation() ) - 1.5708 ;
        int x = (int) Math.round(getX() + Math.cos(angle) * distance);
        int y = (int) Math.round(getY() + Math.sin(angle) * distance);
        
        setLocation(x, y);
    }
}
