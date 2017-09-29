// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class blob extends Actor
{
    private int life = Greenfoot.getRandomNumber(10) + 20;

    /**
     * Act - do whatever the blob wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(10);
        life = life - 1;
        if (life == 0) {
            getWorld().addObject( new splat(), getX(), getY());
            getWorld().removeObject(this);
        }
    }
}
