import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mermaid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mermaid extends Actor
{
    /**
     * Act - do whatever the Mermaid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Mermaid ()
    {
        GreenfootImage image = getImage();  
        image.scale(60, 40);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
