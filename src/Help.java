import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends World
{

    /**
     * Constructor for objects of class Help.
     * 
     */
    
    public Help()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 570, 1);
        showHelp();
        //GreenfootImage bg = new GreenfootImage("welcomescreen.png");
    }
    
    private void showHelp()
    {
        setup();
        //addObject(new Player(), 370, 275);
    }
    private void setup()
    {
        GreenfootImage bg = new GreenfootImage("welcomescreen.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        addObject(new Button("Start") , 270,500);
        addObject(new Button("Back") , 490,500);
        addObject(new HelpDisplay() , 380,200);
        //addObject(new Button("Help") , 240,330);
        addObject(new GameTitle() , 380,70);
        addObject(new Wolf(), 60,100);
        addObject(new Wolf(), 690,100);
    }
}
