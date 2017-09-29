// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class HomeScreen extends World
{

    /**
     * Constructor for objects of class HomeScreen.
     */
    public HomeScreen()
    {
        super(600, 400, 1);
    }

    /**
     * 
     */
    public void act()
    {
        showText("Please Enter to Play The Game", 400, 30);
        if (Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld( new  MyWorld());
        }
    }
}
