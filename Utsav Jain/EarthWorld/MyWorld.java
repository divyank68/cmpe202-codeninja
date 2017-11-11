import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(1000, 750, 1); 
        wall w1 = new wall(100,30);
        wall w2 = new wall(300, 30);
        wall w3 = new wall(400,30);
        wall w4 = new wall(600,30);
        TempWall w5 = new TempWall(30,150);//390,600
        TempWall tw1 = new TempWall(30,110);
        TempWall tw2 = new TempWall(30,110);
        borderWall borderDown = new borderWall(1000,30);
        borderWall borderUp = new borderWall(1000,30);
        Jumpe j = new Jumpe(100,100);
        Bamboo b = new Bamboo(200,200);
        Ninja n = new Ninja(50,100);
        MovingBrick mb1 = new MovingBrick(150,30);
        MovingBrick mb2 = new MovingBrick(150,30);
        Shuriken s = new Shuriken();
        addObject(borderDown, 509,734);
        addObject(borderUp, 400,0);
        addObject(w1, 50,484);
        addObject(tw1,215,190);
        addObject(tw2, 400, 60);
        addObject(w5, 400, 645);
        addObject(w2, 150, 250);
        addObject(w3, 700, 315);
        addObject(w4, 500,120);
        addObject(j, 912,664);
        addObject(b, 662, 627);
        addObject(n, 50,632);
        addObject(mb1, 322,479);
        addObject(mb2, 640,479);
        addObject(s, 692,187);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
