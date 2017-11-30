import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class levelup3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class levelup3 extends World
{

    /**
     * Constructor for objects of class levelup3.
     * 
     */
    public levelup3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
    }
      public void act()
    {
        
        
      
        if (Greenfoot.isKeyDown("enter")) {
            
            Greenfoot.setWorld( new  EarthWorld());
            
        
        
        }
    }
}
