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
        if (getX() + 10 > 660) {
            turn(180);
        }
        if (getX() - 10 < 425) {
            turn(180);
        }
    }
}
