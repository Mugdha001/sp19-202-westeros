import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PineTree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PineTree extends Actor implements ITreeInterface
{
      private String type;
      private int size;
      
      public PineTree(String t){
          type = t;
      }
      
      public void setSize(int s){
        GreenfootImage img = getImage();
        if(s == 1){
            img.scale(img.getWidth() - 313 , img.getHeight() - 323);
        }
        
        setImage(img);
      }
}
