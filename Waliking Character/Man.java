import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Man extends Actor
{
    private GreenfootImage[] images= new GreenfootImage[8];
    private int jeda=10, num=0, deltax=30;
    public void addedToWorld(World Latar) 
    {
        for(int i=0; i<images.length; i++)
        {
            images[i]=new GreenfootImage("image"+i+".jpg");
        }
        setImage(images[0]);
    }
    public void act()
    {
        if(jeda==0)jeda=10;
        if(jeda==1)
        {
            setImage(images[num]);
            num++; 
            if(num>=images.length)num=0;
            setLocation(getX()+deltax,getY());
            if(getX()>getWorld().getWidth()+100)setLocation(-100,getY());
        }
        if(jeda>0)jeda--;
    }    
}
