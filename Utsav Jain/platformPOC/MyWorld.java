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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.              
        super(600, 400, 1); 
        Platform p1 = new Platform(100,30);
        Platform p2 = new Platform(100,30);
        Platform p3 = new Platform(600,30);
        Vplatform v1 = new Vplatform(30, 100);
        Player p = new Player();
        addObject(p1, 300,300);
        addObject(p2, 150, 200);
        addObject(p, 550,300);
        addObject(p3, 570, 370);
        addObject(v1, 520, 320);
    }
    
}
