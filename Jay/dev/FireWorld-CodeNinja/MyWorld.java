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
        Bricks b11 =  new  Bricks();
        Bricks b12 =  new  Bricks();
        Bricks b13 =  new  Bricks();
        Bricks b14 =  new  Bricks();
        ninja ninja1 =  new  ninja();
        BaseBrick bb1 =  new  BaseBrick();
        fireballs fb1 =  new  fireballs();
        Shuriken s1 =  new  Shuriken();
        barrier br1 =  new  barrier();
        barrier br2 =  new  barrier();
        Bomb bomb1 =  new  Bomb();
        barrel barrel1 =  new  barrel();
        end end =  new  end();
        addObject(b1, 430, 280);
        addObject(b2, 150, 280);
        addObject(b3, 300, 190);
        addObject(b12, 365, 190);
        addObject(b14, 565, 100);
        addObject(b4, 500, 100);
        addObject(b5, 435, 100);
        addObject(b6, 370, 100);
        addObject(b8, 178, 100);
        addObject(b9, 114, 100);
        addObject(b10, 50, 100);
        addObject(ninja1, 25, 335);
        addObject(bb1, 294, 378);
        addObject(fb1, 70, 61);
        addObject(s1, 550, 260);
        addObject(b11, 550, 280);
        addObject(b13, 235, 190);
        addObject(br1, 550, 380);
        addObject(br2, 290, 380);
        addObject(bomb1, 450, 80);
        addObject(barrel1, 130, 75);
        addObject(end, 565, 69);
    }
}
