import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EarthWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public EarthWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1, false); 
        Step1 bottom = new Step1(900,30);
        Player p = new Player();
        Step1 s1 = new Step1(350,30);
        Step1 s2 = new Step1(350,30);
        Step1 s3 = new Step1(350,30);
        Step1 side = new Step1(30,600);
        Step1 leftside = new Step1(30, 600);
        //showText("Hello",300,200);
        Monster m = new Monster();
        addObject(p, 50,50);
        addObject(m, 830,50);
        addObject(bottom, 430,587);
        addObject(s1, 412,140);
        addObject(s2, 264,291);
        addObject(s3, 420,432);
        addObject(side, 890,300);
        addObject(leftside, 10,300);
    }
}
