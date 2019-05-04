/**
 * Write a description of class DragonGlassFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DragonGlassFactory extends WeaponFactory
{
    /**
     * Weapon: get weapon
     */
    public Weapon getWeapon()
    {
        return new DragonGlass() ;
    }
}
