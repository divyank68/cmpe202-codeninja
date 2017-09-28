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
        if(!intersects((Actor)getWorld().getObjects(player2.class).get(0)))
        {
            setLocation(getX(), getY()+dy);
            
        }
       
        if (Greenfoot.isKeyDown("up")==true){
            if(!intersects((Actor)getWorld().getObjects(player2.class).get(0))){
            dy = -10;
            }
            else 
            {
                  dy =-10;
            }
        }
        if (Greenfoot.isKeyDown("left")==true ){
           if(!intersects((Actor)getWorld().getObjects(player2.class).get(0))){
                setLocation(getX()-1, getY());
            }
            else 
            {
                //setLocation(getX()+1, getY());
            }
            
        }
        
        if (Greenfoot.isKeyDown("right")==true){
           // setLocation(getX()+1, getY());
            if(!intersects((Actor)getWorld().getObjects(player2.class).get(0))){
                setLocation(getX()+1, getY());
            }
            else 
            {
                //setLocation(getX()-1, getY());
            }
            
        
        }
        
        dy +=g;
        
    }    
    
}
