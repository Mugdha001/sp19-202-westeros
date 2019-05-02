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
   private static HashMap<String, Tree> trees = new HashMap<String, Tree>();

   public static Tree getTree(String type) {
        Tree tree =  trees.get(type);
        System.out.println("size of hashmap: "+ trees.size());
        for(int i = 0; i< trees.size(); i++){
            System.out.println(trees);
        }

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
