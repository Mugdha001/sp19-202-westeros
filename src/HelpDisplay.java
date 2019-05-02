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
        String displayHealth = "Navigation\n"+"Press Left or Right arrow keys\n to move player";
        String shootHelp = "Shoot\n"+"Press Space to shoot";
        String shootCommand = "Press 'a' to activate Dragonglass bullets";
        String shootCommand1 = "Press 'd' to activate fire bullets";
        String collectCoins = "Collect Coins\n"+"Move Player over coins to collect the coins";   
        GreenfootImage img = new GreenfootImage(500,500); 
        img.setFont(new Font("Stensil", false, true,18));
        img.setColor(Color.RED);
        img.drawString(displayHealth ,50,200);
        img.drawString(shootHelp ,50,300);
        img.drawString(collectCoins ,50,350);
        img.drawString(shootCommand ,50,400);
        img.drawString(shootCommand1 ,50,425);



        setImage(img);
    }
}
