import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
 
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int angle= 10+ Greenfoot.getRandomNumber(10);
        angle+= getRotation();
        int step=5;
        movearound();
        turn(Greenfoot.getRandomNumber(90));
    } 
    public void movearound()
    {
        move(-4);
    }
   
}
