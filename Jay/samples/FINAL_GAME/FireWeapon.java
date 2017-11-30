import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirePower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireWeapon extends Actor implements weapon
{
    /**
     * Act - do whatever the FirePower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = -4;
    int power = 5;
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
