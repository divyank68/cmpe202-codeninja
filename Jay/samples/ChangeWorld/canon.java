// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class canon extends Actor
{

    /**
     * Act - do whatever the canon wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("left")) {
            setRotation(getRotation() - 5);
        }
        if (Greenfoot.isKeyDown("right")) {
            setRotation(getRotation() + 5);
        }
        if ("space".equals(Greenfoot.getKey())) {
            fire();
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
}
