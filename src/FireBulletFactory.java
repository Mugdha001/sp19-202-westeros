/**
 * Write a description of class FireBulletFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireBulletFactory extends WeaponFactory
{
    /**
     * Weapon: get weapon
     */ 
    public Weapon getWeapon()
    {
        return new FireBullet();
    }
}
