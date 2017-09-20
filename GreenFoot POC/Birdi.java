import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Birdi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Birdi extends Actor
{
    /**
     * Act - do whatever the Birdi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dy =-10;  
    double g = 1;
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY()+dy);
        if (Greenfoot.isKeyDown("up")==true){
            dy = -10;
        }
        if (Greenfoot.isKeyDown("left")==true){
            setLocation(getX()-1, getY());
        }
        
        if (Greenfoot.isKeyDown("right")==true){
            setLocation(getX()+1, getY());
        }
        
        dy +=g;
        
    }    
    
}
