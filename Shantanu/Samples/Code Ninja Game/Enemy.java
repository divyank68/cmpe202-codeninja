import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Enemy extends Actor
{
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
        setRotation(180);
    }
    public void move()
    {
        setLocation(getX()+ vx, getY());
        Actor actor = getOneIntersectingObject(Person.class);
        if(actor!=null)
        {
            ((Person)actor).Hancur();
            Hancur();
        }
        if(getX()<-200)
        {
            toRemove=true;
    }
}
public void Hancur()
{
    for(int i=0; i<10; i++)

    {
        int px=Greenfoot.getRandomNumber(40);
        int py=Greenfoot.getRandomNumber(40);
        getWorld().addObject(new Poc(getImage()), getX()+px, getY()+py);
    }
    getWorld().addObject(new Boc(), getX(), getY());
    toRemove=true;
}
    public void act() 
    {
        if(!toRemove)move();
        else getWorld().removeObject(this);
    }    
}
