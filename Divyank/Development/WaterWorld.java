import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WaterWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WaterWorld extends World
{

    /**
     * Constructor for objects of class WaterWorld.
     * 
     */
    public WaterWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Ninja n = new Ninja();
        Fish f1 = new Fish();
        Fish f2 = new Fish();
        Fish f3 = new Fish();
        Fish f4 = new Fish();
        Fish f5 = new Fish();
        Fish f6 = new Fish();
        Starfish f7 = new Starfish();
        Starfish f8 = new Starfish();
        Starfish f9 = new Starfish();
        Starfish f10 = new Starfish();
        addObject(n, 10, 180);
        addObject(f1, 80, 150);
        addObject(f2, 150, 300);
        addObject(f3, 230, 400);
        addObject(f4, 350, 350);
        addObject(f7, 500, 10);
        addObject(f8, 600, 80);
        addObject(f9, 450, 350);
        addObject(f10, 350, 350);
    }
}
