import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //private GreenfootImage l = new GreenfootImage("ball.png");
    GreenfootImage drawedImage = new GreenfootImage( getWorld().getObjects(Apple2.class));
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("right")) {
           this.setImage(drawedImage);
        }
    }    
}
