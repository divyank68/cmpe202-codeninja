import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class abstractFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class bulletTemplate extends Actor
{
    /**
     * Act - do whatever the abstractFactory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int power =1;
    public int speed =4;
    public final void disappear(){
        if(getOneIntersectingObject(Step1.class)!=null){
            World world;
            world = getWorld();
            world.removeObject(this);    
        }
    }
    public final void shoot(){
        move(speed);
    }
    public int getPower(){
        return power;
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
