import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class FirePower extends Actor
{
    
    //Counter counter= new Counter();
    private int vx=0;
    public boolean toRemove= false;
    
    public FirePower()
    {
    }
    
    public FirePower(int v)
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
            Hancur();
        }
        if(getX()<-200 || getY()>(getWorld().getHeight()-114))
        {
            toRemove=true;
             
    }
}
public void Hancur()
{
    for(int i=0; i<10; i++)

    {
        int px=Greenfoot.getRandomNumber(30);
        int py=Greenfoot.getRandomNumber(20)+10;
        getWorld().addObject(new Poc(getImage()), getX()+px, getY()+py);
    }
    getWorld().addObject(new Boc(), getX(), getY());
    toRemove=true;
}
    public void act() 
    {
        if(!toRemove)move();
        else
        {
        getWorld().removeObject(this);
         
        }
   }    
}
