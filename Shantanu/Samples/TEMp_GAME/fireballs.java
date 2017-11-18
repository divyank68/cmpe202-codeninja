import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class fireballs extends Actor implements Strategy
{
    private int life = Greenfoot.getRandomNumber(10) + 20;

    /**
     * Act - do whatever the fireballs wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (getX() == 70) {
        }
        else {
            move(10);
            life = life - 1;
        }
    }
    
     public Strategy getPowerobject()
    {
         return new fireballs();
        
    }
}
