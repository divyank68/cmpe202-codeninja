import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WindBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WindBullet extends bulletTemplate
{
    /**
     * Act - do whatever the WindBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int power =1;
    int speed =4;
        public int getPower(){
        return power;
    }
    public void act() 
    {
        shoot();
        disappear();
        // Add your action code here.
    }    
}
