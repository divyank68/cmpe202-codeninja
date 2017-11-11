import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Step1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Step1 extends Actor
{
    /**
     * Act - do whatever the Step1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Step1(){
    }
    public Step1(int x, int y){
        GreenfootImage image = getImage();
        image.scale(x,y);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
