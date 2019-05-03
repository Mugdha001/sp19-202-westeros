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
      private int size; 
      
      public PineTree(String t, int s){
          type = t;
          size = s;
          setSize();
          
          System.out.println("Pine tree size " + size + " created");
      }
      
      private void setSize(){
        GreenfootImage img = getImage();
        //smallest
        if(size == 1){
            img.scale(img.getWidth() - 170 , img.getHeight() - 450);
        }
        
        //biggest
        else if(size == 2){
            img.scale(img.getWidth() -140 , img.getHeight() - 360);
        }
        
         else if(size == 3){
            img.scale(img.getWidth() -100 , img.getHeight() - 300);
        }
        
        setImage(img);
      }
}
