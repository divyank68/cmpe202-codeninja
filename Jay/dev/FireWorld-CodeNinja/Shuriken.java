// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Shuriken extends Actor
{
    private int life = Greenfoot.getRandomNumber(10) + 20;

    /**
     * Act - do whatever the Shuriken wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (getX() == 550) {
        }
        else {
            move(10);
            life = life - 1;
        }
    }
}
