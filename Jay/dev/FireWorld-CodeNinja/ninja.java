// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class ninja extends Actor
{
    private int speed = 3;

    /**
     * Act - do whatever the ninja wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("down")) {
            setRotation(getRotation() - 5);
        }
        if (Greenfoot.isKeyDown("up")) {
            setRotation(getRotation() + 5);
        }
        if ("space".equals(Greenfoot.getKey())) {
            fire();
        }
        if (Greenfoot.isKeyDown("right")) {
            moveRight();
        }
        if (Greenfoot.isKeyDown("left")) {
            moveLeft();
        }
    }

    /**
     * 
     */
    private void fire()
    {
        blob blob1 =  new  blob();
        getWorld().addObject(blob1, getX(), getY());
        blob1.setRotation(getRotation());
    }

    /**
     * 
     */
    public void moveRight()
    {
        setLocation(getX() + speed, getY());
    }

    /**
     * 
     */
    public void moveLeft()
    {
        setLocation(getX() - speed, getY());
    }
}
