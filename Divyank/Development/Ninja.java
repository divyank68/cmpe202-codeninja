import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ninja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Ninja extends Actor
{
    int y=0;
    int g=1;
    /**
     * Act - do whatever the Ninja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ninja(){
    
        GreenfootImage image = getImage();  
        image.scale(60, 40);
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
        if(Greenfoot.isKeyDown("right")==true)
        {
            move(5);
        }
        if(Greenfoot.isKeyDown("left")==true)
        {
            move(-5);
        }
        y=y+g;
        checkKeys();
        checkObstacle();
    }
    public void checkKeys()
    {
        if("space".equals(Greenfoot.getKey()))
        {
            getWorld().addObject(new Splash(),getX(),getY());
        }
    }
    public void checkObstacle()
    {
        Actor obs=getOneIntersectingObject(Fish.class);
        if(obs!=null)
        {
            move(-30);
        }
    }   
}
