/**
 * Write a description of class FireBulletFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireBulletFactory extends WeaponFactory
{
      
    public Weapon getWeapon()
    {
        // put your code here
        return new FireBullet();
    }
}
