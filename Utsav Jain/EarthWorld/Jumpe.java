import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jumpe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jumpe extends Actor
{
    /**
     * Act - do whatever the Jumpe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Jumpe(){
    }
    public Jumpe(int x, int y){
        GreenfootImage image = getImage();
        image.scale(x,y);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
