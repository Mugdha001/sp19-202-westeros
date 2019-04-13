/**
 * Write a description of class BulletFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletFactory extends WeaponFactory
{
   
    public Weapon getWeapon()
    {
        // put your code here
        return new Bullet();
    }
}
