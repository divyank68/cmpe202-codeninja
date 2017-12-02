import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver3 extends World
{

    /**
     * Constructor for objects of class GameOver3.
     * 
     */
    public GameOver3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
    }
     public void act()
    {
        
        
      
        if (Greenfoot.isKeyDown("enter")) {
            
            Greenfoot.setWorld( new  WaterWorld());
            
        
        
        }
    }
}
