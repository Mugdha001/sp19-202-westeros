import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PineTree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PineTree extends Tree
{
      private String type;
      private int size; //extrinsic
      
      public PineTree(String t){
          type = t;
      }
      
      public void setSize(int s){
        GreenfootImage img = getImage();
        if(s == 1){
            img.scale(img.getWidth() - 50 , img.getHeight() - 200);
        }
        
        else if(s == 3){
            img.scale(img.getWidth() +60 , img.getHeight() + 100);
        }
        
        setImage(img);
      }
}
