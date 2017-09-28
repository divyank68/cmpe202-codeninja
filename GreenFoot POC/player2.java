import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player2 extends Actor
{
    /**
     * Act - do whatever the player2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dy =-10;  
    double g = 1;
    public void act() 
    {
        // Add your action code here.
        int x, y;
        x = getX();
        y = getY();
        setLocation(getX(), getY()+dy);
        if (Greenfoot.isKeyDown("w")==true){
            
            dy = -10;
        }
        if (Greenfoot.isKeyDown("a")==true){
            setLocation(getX()-1, getY());
        }
        
        if (Greenfoot.isKeyDown("d")==true){
            setLocation(getX()+1, getY());
        }
        
        dy +=g;
    }    
}
