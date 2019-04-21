import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BonusWeaponsMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BonusWeaponsMenu extends Actor
{
    /**
     * Act - do whatever the BonusWeaponsMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        showTitle();
    }    
    
    public BonusWeaponsMenu(){
        showTitle();
    }
    
    private void showTitle()
    {
        String menuString = "** Bonus/ Weapons Menu **";
        GreenfootImage img = new GreenfootImage(300,500); 
        img.setFont(new Font("Perpetua", false, true,20));
        img.setColor(Color.RED);
        img.drawString(menuString ,5,125);
        setImage(img);
    }
}
