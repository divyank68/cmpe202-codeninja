import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class FireWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public FireWorld()
    {
        super(900, 600, 1);
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
         Bricks b15 =  new  Bricks();
         Bricks b16 =  new  Bricks();
        fireninja ninja1 =  new  fireninja();
		BaseBrick bb1 =  new  BaseBrick();
        BaseBrick bb2 =  new  BaseBrick();
        BaseBrick bb3 =  new  BaseBrick();
		fireballs fb1 =  new  fireballs();
        Shuriken s1 =  new  Shuriken();
        barrier br1 =  new  barrier();
        barrier br2 =  new  barrier();
        Bomb bomb1 =  new  Bomb();
        end end =  new  end();
        barrel brl1 =  new  barrel();
        addObject(b1, 430, 380);
        addObject(b2, 170, 380);
        addObject(b15, 280, 380);
        addObject(b16, 680, 380);
        addObject(b3, 340, 220);
        addObject(b12, 405, 220);
        addObject(b14, 685, 120);
        addObject(b4, 620, 120);
        addObject(b5, 555, 120);
        addObject(b6, 490, 120);
        addObject(b8, 178, 120);
        addObject(b9, 114, 120);
        addObject(b10, 50, 120);
        addObject(ninja1, 25, 335);
        
		addObject(bb1, 294, 480);
        addObject(bb2, 480, 480);
        addObject(bb3, 600, 480);

        addObject(fb1, 70, 81);
        addObject(s1, 680, 360);
        addObject(b11, 550, 280);
        addObject(b13, 275, 220);
        addObject(br1, 550, 480);
        addObject(br2, 270, 480);
        addObject(bomb1, 450, 100);
        addObject(end, 665, 79);
        addObject(brl1, 270, 195);
    }
}
