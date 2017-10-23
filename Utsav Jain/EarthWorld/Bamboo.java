import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bamboo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bamboo extends Actor
{
    /**
     * Act - do whatever the Bamboo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bamboo(){
    }
    public Bamboo(int x, int y){
        GreenfootImage image = getImage();
        image.scale(x,y);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
