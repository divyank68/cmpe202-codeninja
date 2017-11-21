import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bubbles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bubbles extends Actor
{
    /**
     * Act - do whatever the Bubbles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage bubbles = new GifImage("bubbles.gif");
        
    public void act() 
    {
        // Add your action code here.
        setImage(bubbles.getCurrentImage());
    }    
}
