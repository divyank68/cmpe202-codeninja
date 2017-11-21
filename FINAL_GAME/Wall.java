import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Wall extends Actor
{

    /**
     * Act - do whatever the Wall wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
    
     public void killwall()
    {
        if (isTouching(barrel.class)) {
            removeTouching(barrel.class);
            getWorld().removeObject(this);
        }
    }
}
