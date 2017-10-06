import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("right"))
        {
            move(5);
            checkObstacle();
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        checkObstacle();
        
    }
    public void checkObstacle()
    {
        Actor obs=getOneIntersectingObject(obstacle.class);
        if(obs!=null)
        {
            move(-30);
        }
    }   
}
