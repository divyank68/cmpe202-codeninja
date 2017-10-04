import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class power here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class power extends Actor
{
    /**
     * Act - do whatever the power wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int g = 1;
    int dy = 1;
    int x, y;
    
    
    public void act() 
    {
        Random rand = new Random();
        int  n = rand.nextInt(550) + 50;
        x = this.getX();
        y = this.getY();
        if(y >350)
        {
            x=n;
            y=10;
            dy = 1;
        }
        setLocation(x, y+dy);
        
       
        dy +=g;
        // Add your action code here.
    }    
}
