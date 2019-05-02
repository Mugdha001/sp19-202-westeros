import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirTree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirTree extends Tree
{
      private String type;
      private int size; 
      
      public FirTree(String t, int s){
          type = t;
          size = s;
          setSize();
          
          System.out.println("Fir tree size " + size + " created");
      }
      
      private void setSize(){
        GreenfootImage img = getImage();
        //smallest
        if(size == 1){
            img.scale(img.getWidth() - 720 , img.getHeight() - 500);
        }
        
        //biggest
        else if(size == 2){
            img.scale(img.getWidth() -620 , img.getHeight() - 435);
        }
        
        setImage(img);
      }    
}
