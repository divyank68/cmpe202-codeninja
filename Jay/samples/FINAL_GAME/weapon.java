import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface weapon 
{
    /**
     * Act - do whatever the weapon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void setSpeed(int speed);
    public void setPower(int power);
    public void charge();
}
