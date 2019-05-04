import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IShootingStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IShootingStrategy
{
    public void shoot(World world, WeaponFactory currentWeaponFactory, int Xcoord, int Ycoord);
    
}
