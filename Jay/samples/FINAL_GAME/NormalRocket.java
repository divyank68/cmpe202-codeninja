import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class NormalRocket extends Actor implements Rocket
{
    /**
     * Act - do whatever the NormalRocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void fire(){
         move(5);
    }
    public void damage()
    {
        if(isTouching(Enemy.class) )
        {
            removeTouching(Enemy.class);
           
            getWorld().removeObject(this);
        }
        
    } 
    public void act() 
    {
        fire();
        damage();
        // Add your action code here.
    }    
}
