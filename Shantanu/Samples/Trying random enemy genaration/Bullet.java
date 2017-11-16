import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Person
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("z")){
        setRotation(getRotation() -5);
    }
    if(Greenfoot.isKeyDown("x")){
        setRotation(getRotation() +5);
    }
        
       move(5);
       damage();
    } 
     public void damage()
    {
        if(isTouching(Enemy.class) )
        {
            removeTouching(Enemy.class);
           
            getWorld().removeObject(this);
        }
        
    }  
}
