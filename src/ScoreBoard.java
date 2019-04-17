import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
import greenfoot.Font;
/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor implements Observer
{
    int castleHealth;
    int enemyHealth;
    int enemiesRemaining;
    boolean setDragonGlassBonus = false;
    boolean setFireBonus = false;
    //boolean respawn = false;
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        showScore();  
        addDragonGlassBonus();
        addFireBonus();
    }   
    
    public ScoreBoard()
    {   
        castleHealth = 100;
        enemyHealth = 100;
        enemiesRemaining = 20;
        showScore();
    }
    private void showScore()
    {
        String displayHealth = "ScoreBoard\n\nCastle:\n"+castleHealth+"\n\nWhite Walkers:\n"+enemyHealth+
        "\n\nWalkers remaining:\n"+enemiesRemaining;
        GreenfootImage img = new GreenfootImage(300,500); 
        img.setFont(new Font("Perpetua", false, true,24));
        img.setColor(Color.RED);
        img.drawString(displayHealth ,5,125);
        setImage(img);
    }
    
    public void update(int castle , int enemy)
    {
        if(castle!= -1)
            this.castleHealth = castle;
        
        if(enemy!= -1)
        {
            this.enemyHealth = enemy;
            if(this.enemyHealth <= 0 && enemiesRemaining > 0)
            {
                enemiesRemaining--;
                MyWorld w = (MyWorld)getWorld();
                Enemy e = w.getEnemy();
                e.setHealth(100);
                w.addObject(new EnemyRespawn() ,280 ,540 );                
            }
            else if (this.enemyHealth <= 0 && enemiesRemaining == 0)
            {
                Greenfoot.stop();
            }
          
        }
    }
    
        public void addDragonGlassBonus(){
        if(castleHealth <= 30 && !setDragonGlassBonus){
            getWorld().addObject(new DragonGlassBonus(), 250, 305);
            setDragonGlassBonus = true;
        }
    }
    
    public void addFireBonus(){
        if(castleHealth <= 50 && !setFireBonus){
            getWorld().addObject(new FireBulletBonus(), 500, 305);
            setFireBonus = true;
        }
    }

}
