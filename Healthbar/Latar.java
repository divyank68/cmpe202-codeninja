import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Latar extends World
{
HealthBar healthbar = new HealthBar();
    public Latar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 550, 1, false);
        addObject(new Man(), 200, (int)(0.5*getHeight()));
    }
    public void prepare()
    {
        addObject(healthbar, 200, 40);
}

public HealthBar getHealthBar()
{
    return healthbar;
}
}
