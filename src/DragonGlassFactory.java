/**
 * Write a description of class DragonGlassFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DragonGlassFactory extends WeaponFactory
{
    
    public Weapon getWeapon()
    {
        // put your code here
        return new DragonGlass() ;
    }
}
