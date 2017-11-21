import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Enemy extends Actor
{
    
    //Counter counter= new Counter();
    private int vx=0;
    public boolean toRemove= false;
    public Enemy()
    {
    }
    
    public Enemy(int v)
    {
        vx=v;
    }
    
    public void addedToWorld(World MyWorld)
    {
        //setRotation(180);
    }
    public void move()
    {
        setLocation(getX()+ vx, getY());
        Actor actor = getOneIntersectingObject(Person.class);
        if(actor!=null)
        {
            ((Person)actor).Hancur();
            World myWorld = getWorld();
            MyWorld mw = (MyWorld)myWorld;
            mw.Hancur();
        }
        if(getX()<-200 || getY()>(getWorld().getHeight()-114))
        {
            toRemove=true;
             
    }
}

    public void act() 
    {
        if(!toRemove)move();
        else
        {getWorld().removeObject(this);
         
        }
    }    
}
