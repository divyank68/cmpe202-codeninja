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
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(getRotation()-5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(getRotation()+5);
        }
        if("space".equals(Greenfoot.getKey()))
        {
            Waterattack();
        }
    }  
    public void Waterattack()
    {
        splash sp1=new splash();
        getWorld().addObject(sp1,getX(),getY());
        sp1.setRotation(getRotation());
    }
}
