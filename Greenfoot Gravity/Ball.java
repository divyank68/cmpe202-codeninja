import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Ball extends Actor
{
    private double h=0, v=0, g=10, dt=0.1;
    public void addedToWorld(World later) 
    {
        h=getY();
    }    
    public void act()
    {
        if(getY()<(getWorld().getHeight()))
        {
            double ht= h+v*dt+0.5*g*dt*dt;
            v+=g*dt;
            if(ht>(getWorld().getHeight()))
            {
                h=ht;
                ht=(getWorld().getHeight());
                v*=-1;
            }
            setLocation(getX(),(int)ht);
            h=ht;
}
}
}
