import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Firebullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Firebullet extends bulletTemplate
{
    /**
     * Act - do whatever the Firebullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int power =1;
    int speed =3;
    
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
