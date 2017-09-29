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
    int barrierNum=5;
    int timer = 300;
    boolean isTimer = false;
    tempBarrier a =new tempBarrier();
    void removeBarrier()
    {
        getWorld().removeObject(a);
        barrierNum++;
    }
    public void act() 
    {
        // Add your action code here.
        int x, y;
        x = getX();
        y = getY();
        
        setLocation(getX(), getY()+dy);
        if (Greenfoot.isKeyDown("w")==true){
             dy = -5;
        }
        if (Greenfoot.isKeyDown("a")==true){
            setLocation(getX()-1, getY());
        }
        if (Greenfoot.isKeyDown("d")==true){
            setLocation(getX()+1, getY());
        }
        if (Greenfoot.isKeyDown("i")==true)
        {
            barrierNum--;
            if(barrierNum>0){
                getWorld().addObject(a, getX()+5, getY()+5);
                isTimer=true;
            }
            
        }
       /* if(Greenfoot.isKeyDown("q")==true){
            createBarrier();
                  isTimer = true;
        }*/
        if(isTimer)
        {
            if(timer>0)
            {   
                timer-- ;
            }
            else
            {
                removeBarrier();
                isTimer=false;
                timer = 300;
            }
        }
        if(Greenfoot.isKeyDown("r")==true)
        {
            removeBarrier();
            barrierNum++;
            isTimer=false;
            timer = 300;
        }
        dy +=g;
        }    
    }
