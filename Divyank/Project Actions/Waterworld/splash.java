import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class splash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class splash extends Actor
{
    /**
     * Act - do whatever the splash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(10);
        damage();
    }    
    public void damage()
    {
        if(isTouching(fish.class))
        {
            removeTouching(fish.class);
            getWorld().removeObject(this);
        }
    }
}
