import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BottomBorder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BottomBorder extends Actor
{
    /**
     * Act - do whatever the BottomBorder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public BottomBorder(){
    }
    public BottomBorder(int x, int y){
        GreenfootImage image = getImage();
        image.scale(x,y);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
