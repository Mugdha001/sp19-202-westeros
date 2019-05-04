import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpDisplay extends Actor
{
    /**
     * Act - do whatever the HelpDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        displayHelp();
        getWorld().addObject(new Button("Start") , 550,225);
        getWorld().addObject(new Button("Back") , 550,400);
    }
    
    /**
     * display Help instructions
     */
    private void displayHelp()
    {
        String displayHelp = "NAVIGATE PLAYER: "+"\nPress Left/Right arrow keys\n\n"+"SHOOT: \n"
           +"-Press 'Space' to shoot\n"
           +"-Press 's' to activate Dragonglass\nBonus\n"
           +"-Press 'a' to activate Firebullets\nBonus\n"
           + "-Press 'd' to switch back to \ndefault bullets\n\n"
           +"COLLECT COINS:\n"
           +"Move Player over Bonus coins to \ncollect them";
       GreenfootImage img = new GreenfootImage(600,500);
       img.setFont(new Font("Stensil", false, true,15));
       img.setColor(Color.RED);
       img.drawString(displayHelp ,40,230);
       setImage(img);
    }
}
