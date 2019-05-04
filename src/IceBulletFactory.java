/**
 * Write a description of class IceBulletFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IceBulletFactory extends WeaponFactory 
{
    /**
     * Weapon: get weapon
     */
    public Weapon getWeapon()
    {
        return new IceBullet();
    }
}
