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
        super(800, 600, 1); 
        wall w1 = new wall(100,30);
        wall w2 = new wall(300, 30);
        wall w3 = new wall(400,30);
        wall w4 = new wall(600,30);
        TempWall w5 = new TempWall(30,150);//390,600
        TempWall tw1 = new TempWall(30,150);
        TempWall tw2 = new TempWall(30,110);
        wall borderDown = new wall(800,30);
        Jumpe j = new Jumpe(100,100);
        Bamboo b = new Bamboo(200,200);
        Ninja n = new Ninja(50,100);
        MovingBrick mb1 = new MovingBrick(150,30);
        MovingBrick mb2 = new MovingBrick(150,30);
        
        addObject(borderDown, 400,600);
        addObject(w1, 50,390);
        addObject(tw1,200,160);
        addObject(tw2, 400, 50);
        addObject(w5, 390, 524);
        addObject(w2, 150, 230);
        addObject(w3, 600, 230);
        addObject(w4, 500,100);
        addObject(j, 736,534);
        addObject(b, 560, 500);
        addObject(n, 50,533);
        addObject(mb1, 318,390);
        addObject(mb2, 650,390);
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
