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
        super(750, 500,1); 
        addObject(new Enemy() ,450 ,460);
        addObject(new Enemy() ,250 ,460);
        addObject(new Player(),330 ,200);
        addObject(new Castle(),350,70);
        addObject(new ScoreBoard(), 730,300);
    }
}
