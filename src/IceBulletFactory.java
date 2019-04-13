/**
 * Write a description of class IceBulletFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IceBulletFactory extends WeaponFactory 
{
    
    public Weapon getWeapon()
    {
        // put your code here
        return new IceBullet();
    }
}
