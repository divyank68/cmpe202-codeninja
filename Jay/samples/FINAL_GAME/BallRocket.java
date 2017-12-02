import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BallRocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BallRocket extends Actor implements Rocket
{
    public void fire(){
        move(9);
    }
    public void damage()
    {
        
        if(isTouching(Enemy.class) )
        {
            
           
       
            removeTouching(Enemy.class);
           World w=getWorld();
            getWorld().removeObject(this);
            Boc b = new Boc();
            b.addedToWorld(getWorld());
            Poc p = new Poc(getImage());
            p.addedToWorld(getWorld());
        }
        
    } 
    public void act() 
    {
        fire();
        damage();
        // Add your action code here.
    }    
}
