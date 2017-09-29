import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tempBarrier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tempBarrier extends Actor
{
    /**
     * Act - do whatever the tempBarrier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int g = 1; 
    int dy=-5;
    public void act() 
    {
        int x, y;
        x = getX();
        y = getY();
        setLocation(getX(), getY()+dy);
        dy +=g;
        // Add your action code here.
    }    
}
