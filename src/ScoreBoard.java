import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
import greenfoot.Font;
/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    int castleHealth;
    int enemyHealth;
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        showScore();        
    }   
    
    public ScoreBoard()
    {
        castleHealth = 100;
        enemyHealth = 100;       
    }
    private void showScore()
    {
        String displayHealth = "ScoreBoard\n\nCastle:\n"+castleHealth+"\n\n\n\nWhite Walkers:\n"+enemyHealth;
        GreenfootImage img = new GreenfootImage(300,500); 
        img.setFont(new Font("Perpetua", false, true,24));
        img.setColor(Color.RED);
        img.drawString(displayHealth ,5,125);
        setImage(img);
    }
    
}
