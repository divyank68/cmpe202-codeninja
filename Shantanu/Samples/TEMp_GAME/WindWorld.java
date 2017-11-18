import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class WindWorld extends World
{

    //GreenfootSound myMusic= new GreenfootSound("Skip_-_01_-_HyperSpaceAdventure.mp3");
    private Background1[] bg = new Background1[3];
    
    
    private final int LEFT_BOUNDARY = -300;
    private final int RIGHT_BOUNDARY = 900;
   public WindWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1, false);
        int x = LEFT_BOUNDARY;
        for(int i=0; i<bg.length; i++)
        {
            bg[i] = new Background1();
            addObject( bg[i], x, getHeight()/2 );
            x=x+ 600;
        }
}}
