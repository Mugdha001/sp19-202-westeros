import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mediator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mediator extends Actor implements IMediator
{
    public void setCommandPattern(Player player){
        MyWorld world = (MyWorld) getWorld();
            // command pattern starts
    IBonusCommand fireBulletBonusCommand = new BonusCommand();
    IBonusCommand dragonGlassBonusCommand = new BonusCommand();
    IBonusCommand defaultBulletCommand = new BonusCommand();
    FireBulletBonusButton fireBulletBonusButton = new FireBulletBonusButton();
    DragonGlassBonusButton dragonGlassBonusButton = new DragonGlassBonusButton();
    DefaultBulletButton defaultBulletButton = new DefaultBulletButton();
    
    //command pattern ends
        // Default Bullet weapon
        //map command to invoker
         defaultBulletButton.setCommand(defaultBulletCommand);
         //map receiver to command
         defaultBulletCommand.setReceiver(
          new IBonusReceiver() {
              
              /** Command Action */
              public void doAction() {
                  player.setCurrentWeaponFactory( new PlayerBulletFactory() ) ;
              }
        }
        ) ;
        player.setDefaultBulletMenuInvoker(defaultBulletButton);
        
        
          //fire bullet bonus

         //map command to invoker
         fireBulletBonusButton.setCommand(fireBulletBonusCommand);
         //map receiver to command
         fireBulletBonusCommand.setReceiver(
          new IBonusReceiver() {
              
              /** Command Action */
              public void doAction() {
                  player.setCurrentWeaponFactory( new FireBulletFactory() ) ;
              }
        }
        ) ;
        player.setFireBulletMenuInvoker(fireBulletBonusButton);
        
         
        //dragon glass bonus

         //map command to invoker
         dragonGlassBonusButton.setCommand(dragonGlassBonusCommand);
         //map receiver to command
         dragonGlassBonusCommand.setReceiver(
          new IBonusReceiver() {
              
              /** Command Action */
              public void doAction() {
                  player.setCurrentWeaponFactory( new DragonGlassFactory() ) ;
              }
        }
        ) ;
        player.setDragonGlassMenuInvoker(dragonGlassBonusButton);
        
    }   
}
