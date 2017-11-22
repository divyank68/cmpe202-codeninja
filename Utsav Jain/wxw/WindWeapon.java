import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WindWeapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WindWeapon extends Actor implements weapon
{
    /**
     * Act - do whatever the WindWeapon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     int speed=-6;
    int power=6;
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setPower(int power){
        this.power = power;
    }
    public void charge()
    {
        move(speed);
    }
    public void act() 
    {
        // Add your action code here.
        charge();
    }    
}
