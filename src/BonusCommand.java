/**
 * Write a description of class BonusCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BonusCommand implements IBonusCommand 
{
    IBonusReceiver bonusReceiver;
    public void execute(){
        bonusReceiver.doAction();
    }
    
    public void setReceiver(IBonusReceiver receiver){
        bonusReceiver = receiver;
    }
}
