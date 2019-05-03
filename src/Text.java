import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static final int MAX_DELAY = 20;
    private int delay;
    private String font;
    private Color color;
    private String text;
    public void act() 
    {
        GreenfootImage img = new GreenfootImage(200,200); 
        img.setFont(new Font(font, false, true,28));
        img.setColor(color);
        img.drawString(text,50,50);
        setImage(img);
        blink();
        //blink(); 
        //if(Greenfoot.mouseClicked(this))
        
    }   
    
    public Text(String text, Color color, String font)
    {
        this.text = text;
        this.color = color;
        this.font = font;
        
        /*
        GreenfootImage textImg=new GreenfootImage(" "+text+" ", 24, Color.RED, new Color(0, 0, 0, 0));
        GreenfootImage image=new GreenfootImage(textImg.getWidth()+8, textImg.getHeight()+8);
        image.setColor(Color.BLACK);
        image.fill();
        image.setColor(Color.WHITE);
        image.fillRect(3, 3, image.getWidth()-6, image.getHeight()-6);
        image.setColor(Color.YELLOW);
        image.drawImage(textImg, (image.getWidth()-textImg.getWidth())/2, (image.getHeight()-textImg.getHeight())/2);
        setImage(image);
        */
    }
    
    public void blink()
    {
        int count = 100;
        while(count!=0)
        {
            GreenfootImage img = getImage();
            int t = img.getTransparency();
            Greenfoot.delay(15);
            img.setTransparency(0);
            Greenfoot.delay(15);
            img.setTransparency(t);
            count--;
        }
        //getWorld().removeObject(this);


    }
    
    public void setFont(String value)
    {
        font = value;
    }
    
    public void setColor(Color value)
    {
        color = value;
    }
}
