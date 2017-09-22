// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * Snake!!
 */
public class snake extends Actor
{
    private int score = 0;

    /**
     * Act - do whatever the snake wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
        eatCherry();
        
        move(5);
    }

    /**
     * 
     */
    public void eatCherry()
    {
        if (isTouching(Cherry.class)) {
            removeTouching(Cherry.class);
            score = score + 1;
            getWorld().showText("Your Score:" + score, 100, 30);
        }
    }
}
