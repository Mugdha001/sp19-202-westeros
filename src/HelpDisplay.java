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
        // Add your action code here.
        displayHelp();
    }
    
    private void displayHelp()
    {
        String displayHealth = "NAVIGATE PLAYER: "+"\nPress Left/Right arrow keys\n\n"+"SHOOT: \n"
            +"Press 'Space' to shoot\n"
            +"Press 'a' to activate Dragonglass\n bullets\n"
            + "Press 'd' to activate fire bullets\n\n"
            +"COLLECT COINS:\n"
            +"Move Player over coins to \ncollect the coins";   
        GreenfootImage img = new GreenfootImage(600,500); 
        img.setFont(new Font("Stensil", false, true,18));
        img.setColor(Color.RED);
        img.drawString(displayHealth ,40,230);
        //img.drawString(shootHelp ,50,300);
        //img.drawString(collectCoins ,50,375);
        //img.drawString(shootCommand ,50,450);
        //img.drawString(shootCommand1 ,50,500);



        setImage(img);
    }
}
