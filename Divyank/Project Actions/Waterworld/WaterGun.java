import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WaterGun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WaterGun extends Actor
{
    /**
     * Act - do whatever the WaterGun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if("space".equals(Greenfoot.getKey()))
        {
            Waterattack();
        }
    }  
    public void Waterattack()
    {
        getWorld().addObject(new splash(),getX(),getY());
    }
}
