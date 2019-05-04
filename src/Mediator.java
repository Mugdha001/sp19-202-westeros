import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mediator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mediator extends Actor implements IMediator
{
    /**
     * player: set command pattern for the player
     */
    public void setCommandPattern(Player player){
        
        IBonusCommand fireBulletBonusCommand = new BonusCommand();
        IBonusCommand dragonGlassBonusCommand = new BonusCommand();
        IBonusCommand defaultBulletCommand = new BonusCommand();
        FireBulletBonusButton fireBulletBonusButton = new FireBulletBonusButton();
        DragonGlassBonusButton dragonGlassBonusButton = new DragonGlassBonusButton();
        DefaultBulletButton defaultBulletButton = new DefaultBulletButton();
        
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
    
    /**
     * add trees in the world
     */
    public void addTrees(){
        
        TreeRegistry.loadRegistry();
        getWorld().addObject(TreeRegistry.getTree(1), 134, 282);//pine size 1
        getWorld().addObject(TreeRegistry.getTree(2), 88, 349);// pine size 2
        getWorld().addObject(TreeRegistry.getTree(2), 625, 299);// pine size 2
        getWorld().addObject(TreeRegistry.getTree(3), 31, 464);// pine size 3
        getWorld().addObject(TreeRegistry.getTree(4), 118, 423);// fir size 1
        getWorld().addObject(TreeRegistry.getTree(1), 560, 306);// pine size 1
        getWorld().addObject(TreeRegistry.getTree(6), 698, 395);// fir size 3
        getWorld().addObject(TreeRegistry.getTree(1), 518 , 236);// pine size 1
        getWorld().addObject(TreeRegistry.getTree(4), 46 , 212);// fir size 1
        getWorld().addObject(TreeRegistry.getTree(4), 715 , 202);// fir size 1
    }
}
