import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Waterbullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Waterbullet extends bulletTemplate
{
    /**
     * Act - do whatever the Waterbullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int power =1;
    int speed =2;
    public int getPower(){
        return power;
    }
    public void act() 
    {
        // Add your action code here.
        shoot();
        disappear();
    }    
}
