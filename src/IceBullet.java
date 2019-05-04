import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IceBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IceBullet extends Weapon
{
    
    int shootingAngle;
    int speed;
    /**
     * Act - do whatever the IceBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        speed = ((MyWorld)getWorld()).getIceBulletSpeed();
        move(speed);
        remove();
    }   
    
    /**
     * Constructor
     */
    public IceBullet()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 5 , img.getHeight() - 5);
        setImage(img);
        shootingAngle = getRandomNumber(240,320);
        setRotation(shootingAngle);
        Greenfoot.playSound("EnemyShoot.mp3");
    }
    
    /**
     * remove method
     */
    public void remove()
    {
        Actor player = getOneIntersectingObject(Player.class);
        Actor castle = getOneIntersectingObject(Castle.class);
        Actor playerbullet = getOneIntersectingObject(PlayerBullet.class);
        if(playerbullet != null)
        {
            getWorld().addObject(new Snowsplat(), getX(), getY() );
            getWorld().removeObject(this);
        }
        else if (player != null)
        {
            getWorld().addObject(new PlayerAbsorb(), getX(), getY() );
            getWorld().removeObject(this);
        }
        else if(castle != null)
        {
            MyWorld w = (MyWorld)getWorld();
            Castle c = w.getCastle();
            c.setHealth(c.getHealth()-10); 
            getWorld().addObject(new Snowsplat(), getX(), getY() );
            getWorld().removeObject(this);
        }
        else if(getX()==749||getX()==0||getY()==0||getY()==499)
        {
                getWorld().removeObject(this);
        }
       }
       
      /**
       * start: start
       * end: end
       */ 
     private int getRandomNumber(int start,int end)
     {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
     }
}