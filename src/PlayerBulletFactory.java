/**
 * Write a description of class BulletFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerBulletFactory extends WeaponFactory
{
   /**
    * Weapon: get weapon
    */
    public Weapon getWeapon()
    {
        return new PlayerBullet();
    }
}
