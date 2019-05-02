import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap;
/**
 * Write a description of class TreeFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreeFactory extends Actor
{
   private static final HashMap<String, ITreeInterface> trees = new HashMap<String, ITreeInterface>();

   public static ITreeInterface getTree(String type) {
        ITreeInterface tree =  trees.get(type);

        if (tree == null) {
            if ("fir".equals(type)) {
                tree = new FirTree(type);
            } else if ("pine".equals(type)) {
                tree = new PineTree(type);
            }
            trees.put(type, tree);
        }
        return tree;    
    }
}
