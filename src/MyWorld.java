import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750,570,1); 
        
        GreenfootImage bg = new GreenfootImage("snow_background.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        addObject(new Castle(),370,145);
        
        addObject(new Player(), 370, 305);
        
        addObject(new Enemy() , 280 ,540);
        addObject(new Enemy() , 480 ,540);
        
        
        addObject(new ScoreBoard() , 740, 200);
    }
}
