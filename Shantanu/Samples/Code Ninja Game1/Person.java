import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    private int targetx = 0, targety=0;
    private int jeda= 0;
    private boolean toRemove= false;
    public void addedToWorld(World MyWorld)
    {
        targetx= getX();
        targety= getY();
        
    }
    public void move()
    {
        double rx= targetx - getX();
        double ry= targety - getY();
        double r= Math.sqrt(rx*rx + ry*ry);
        int bts=5;
        int posx=0, posy=0;
        if(r>bts)
        {
            posx=(int) (getX()+bts*rx/r);
            posy=(int)(getY()+ bts*ry/r);
        }
        else
        {
            posx= targetx;
            posy= targety;
        }
        setLocation(posx, posy);
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
        if(Greenfoot.mouseMoved(null))
        {
            MouseInfo mouse= Greenfoot.getMouseInfo();
            targetx= mouse.getX();
            targety= mouse.getY();
        }
        move();
        if(jeda>0)
        jeda--;
        if(jeda == 1) getWorld().addObject(new Rocket(), getX()+ 100,getY());
        if(jeda==0)jeda=40;
        if(toRemove)getWorld().removeObject(this);
    }    
}
