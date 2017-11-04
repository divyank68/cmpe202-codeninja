import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Splash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Splash extends Actor
{
    /**
     * Act - do whatever the Splash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public Splash(){
    
        GreenfootImage image = getImage();  
        image.scale(30, 40);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
        move(10);
        damage();
    }    
    public void damage()
    {
        if(isTouching(Fish.class) ||isTouching(Starfish.class))
        {
            removeTouching(Fish.class);
            removeTouching(Starfish.class);
            getWorld().removeObject(this);
        }
        
    }   
}
