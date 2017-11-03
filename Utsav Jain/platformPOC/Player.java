import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dy=0;
    int dx=0;
    int dt=0;
    int g =1;
    public void jump(){
            dy=-3;
            setLocation(getX(), getY()+dy);
    }
    public void moveleft(){
        move(-2);
    }
    public void moving(){
       if(Greenfoot.isKeyDown("left")){
               move(-2);  
               if (getOneIntersectingObject(Vplatform.class) != null) move(2);  
               // moveleft();
            }
       if(Greenfoot.isKeyDown("right")){
                dx = 1;
                move(2);
            }
       if(Greenfoot.isKeyDown("up")){
                //Add Conditionn for isTouchingGround.
                //if(isTouching(null)){
                   jump();
                //}
            }
       
    }
    public void fall(){
        dy = dy+g;
        setLocation(getX(), getY()+dy);
    }
    public void checkedFall(){
        if(!isTouching(null)){
            fall();
        }
    }
    public void act() 
    {
        // Add your action code here.
        moving();
        checkedFall();
    }    
}
