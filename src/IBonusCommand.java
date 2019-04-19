/**
 * Write a description of class IBonusCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IBonusCommand  
{
   public void setReceiver(IBonusReceiver receiver);
   public void execute();
}
