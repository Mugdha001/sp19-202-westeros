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
    
    /**
     * populate hashmap
     */
    public static void loadRegistry(){
        treesMap.put(1, new PineTree("pine", 1));
        treesMap.put(2, new PineTree("pine", 2));
        treesMap.put(3, new PineTree("pine", 3));
        treesMap.put(4, new FirTree("fir", 1));
        treesMap.put(5, new FirTree("fir", 2));
        treesMap.put(6, new FirTree("fir", 3));
    }
    
    /**
     * type: type
     * Tree: get tree object
     */
    public static Tree getTree(int type){
        Tree tree = treesMap.get(type);
        return (Tree)tree.clone();
    }
}
