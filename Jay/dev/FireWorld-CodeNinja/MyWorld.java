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
     * 
     */
    public void prepare()
    {
        Bricks b1 =  new  Bricks();
        Bricks b2 =  new  Bricks();
        Bricks b3 =  new  Bricks();
        Bricks b4 =  new  Bricks();
        Bricks b5 =  new  Bricks();
        Bricks b6 =  new  Bricks();
        Bricks b7 =  new  Bricks();
        Bricks b8 =  new  Bricks();
        Bricks b9 =  new  Bricks();
        Bricks b10 =  new  Bricks();
        ninja ninja1 =  new  ninja();
        addObject(b1, 400, 280);
        addObject(b2, 200, 280);
        addObject(b3, 300, 190);
        addObject(b4, 500, 100);
        addObject(b5, 435, 100);
        addObject(b6, 370, 100);
        addObject(b8, 178, 100);
        addObject(b9, 114, 100);
        addObject(b10, 50, 100);
        addObject(ninja1, 25, 335);
    }
}
