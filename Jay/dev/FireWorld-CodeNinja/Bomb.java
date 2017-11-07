// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bomb extends Actor
{

    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1);
        if (getX() + 10 > 560) {
            turn(180);
        }
        if (getX() - 10 < 325) {
            turn(180);
        }
    }
}
