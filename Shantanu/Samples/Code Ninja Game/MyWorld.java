import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    private int jeda=0;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        addObject(new Person(), 100, 200);
    }
    public void act()
    {
        if(jeda>0)jeda--;
        else jeda=20;
        if(jeda==1)
        {
            int py = Greenfoot.getRandomNumber(getHeight());
            addObject(new Enemy(-(2+Greenfoot.getRandomNumber(3))), getWidth()+200,py);
        }
    }
}
