import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dragon extends Actor
{
    /**
     * Act - do whatever the Dragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timebetweenshots = 0;
    public void act() 
    {
        // Add your action code here.
        
        if(atWorldEdge()){
            randomMoveDragon();
        }
        if(timebetweenshots % 30 == 0)
            shoot();
        timebetweenshots++;
        if(timebetweenshots == 1000)
            timebetweenshots = 0;
        move(3);
        //shoot();
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
    public void randomMoveDragon(){
         if (getX() <= getWorld().getWidth() -2 && getX()>100) {
         setLocation(getX() - 2, getY());
         turn(180);         
         setImage("dragon3_tilted.png");  
     }  
     else if (getX() <=100)  {
         setLocation(getX() + 10, getY());  
         turn(180);
         setImage("dragon3_upright.png");
      }
    }
    public void shoot()
    {
        FireBullet firebullet = new FireBullet();
        getWorld().addObject(firebullet, getX(), getY());
    }
}
