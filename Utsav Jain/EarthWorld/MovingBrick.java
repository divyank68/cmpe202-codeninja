import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingBrick extends Actor
{
    /**
     * Act - do whatever the MovingBrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public MovingBrick(){
    }
    public MovingBrick(int x, int y){
        GreenfootImage image = getImage();
        image.scale(x,y);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
