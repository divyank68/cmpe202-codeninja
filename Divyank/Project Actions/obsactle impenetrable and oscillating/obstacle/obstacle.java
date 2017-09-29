import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obstacle extends Actor
{
    /**
     * Act - do whatever the obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int timer=50;
    private int direction = 5; 
    public void act() 
    {
        // Add your action code here.
        //setLocation(getX(), getY() + 4);
        // if(timer>0)
        // {
            // setLocation(getX(), getY() + 5);
            // timer--;
        // }
        // if(timer==0)
        // {
            // setLocation(getX(), getY() - 5);
            
            // timer=250;
        // }
        if ((direction < 0 && getY() == 0) || (direction > 0 && getY() == getWorld().getHeight()-1)) direction = -direction;  
        // movement
        setLocation(getX(), getY() + direction);
        //move(direction);
        //setLocation(getX(), getY() + 4);
        
    }    
}
