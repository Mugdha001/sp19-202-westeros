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
        //GreenfootImage bg = new GreenfootImage("welcomescreenhelp.png");
        //bg.scale(getWidth(), getHeight());
        //setBackground(bg);
        setup();
        //addObject(new Player(), 370, 275);
    }
    private void setup()
    {
        GreenfootImage bg = new GreenfootImage("welcomescreenhelp.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        addObject(new Button("Start") , 550,225);
        addObject(new Button("Back") , 550,400);
        addObject(new HelpDisplay() , 380,200);
        //addObject(new Button("Help") , 240,330);
        addObject(new GameTitle() , 380,70);
        addObject(new Wolf(), 60,100);
        addObject(new Wolf(), 690,100);
    }
}
