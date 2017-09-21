import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int y=0;
    int g=1;
    public FlappyBird(){
    
        GreenfootImage image = getImage();  
        image.scale(120, 80);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(),getY()+y);
        
        if(Greenfoot.isKeyDown("up")==true)
        {
            y=-10;
        }
        y=y+g;
    
    }    
}
