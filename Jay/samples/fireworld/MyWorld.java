// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        canon canon =  new  canon();
        Wall wall1 =  new  Wall();
        Wall wall2 =  new  Wall();
        Wall wall3 =  new  Wall();
        Wall wall4 =  new  Wall();
        addObject(canon, 100, 307);
        addObject(wall1, 400, 248);
        addObject(wall2, 200, 50);
        addObject(wall3, 300, 300);
        addObject(wall4, 500, 100);
    }
}
