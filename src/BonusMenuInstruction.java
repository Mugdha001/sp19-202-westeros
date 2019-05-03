import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BonusMenuInstruction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BonusMenuInstruction extends Actor
{
    private String key;
    /**
     * Act - do whatever the BonusMenuInstruction wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        showInstruction();
    }    
    
    /**
     * Constructor
     * k: keyboard key to be included in the instruction
     */
    public BonusMenuInstruction(String k){
        key = k;
    }
    
    /**
     * Display instruction to activate collected bonus
     */
    private void showInstruction()
    {
        String instruction = ": Press '" + key + "'";
        GreenfootImage img = new GreenfootImage(300,500); 
        img.setFont(new Font("Perpetua", false, true,17));
        img.setColor(Color.RED);
        img.drawString(instruction ,5,125);
        setImage(img);
    }    
}
