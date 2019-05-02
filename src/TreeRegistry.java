import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap;
/**
 * Write a description of class TreeRegistry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreeRegistry extends Actor
{
    private static HashMap<Integer, Tree> treesMap = new HashMap<Integer, Tree>();
    
    public static void loadRegistry(){
        treesMap.put(1, new PineTree("pine", 1));
        treesMap.put(2, new PineTree("pine", 2));
    }
    
    public static Tree getTree(int type){
        Tree tree = treesMap.get(type);
        return (Tree)tree.clone();
    }
}
