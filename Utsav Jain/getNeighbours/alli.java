import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class alli here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class alli extends Actor
{
    /**
     * Act - do whatever the alli wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World w = getWorld();
    int x, y;
    int counter = 0;
    public void act() 
    {
        // Add your action code here.
        move(1);
        if(Greenfoot.isKeyDown("down")){
            turn(-2);
        }
        if(Greenfoot.isKeyDown("up")){
        turn(2);
        }
        //apl ap = getOneIntersectingObject(null);
        boolean a = !getNeighbours(10,true, null).isEmpty();
        //ap = getOneIntersectingObject(null);
        if(a){
            System.out.println(counter++);
        }
        else{
            counter =0; 
        }
    }    
}
