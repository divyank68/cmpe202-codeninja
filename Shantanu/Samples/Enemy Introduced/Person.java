import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Background1
{
    boolean touch = false;
     private int vSpeed=0;
     private int acceleration= 1;
     private int jumpStrength= 7;
     private double ho=0, vo=0, g=10, dt=0.25;
    public void act() 
    {
        /*if(getY()<(getWorld().getHeight()))
        {
            double ht= ho+vo*dt+0.5*g*dt*dt;
            vo = vo + g*dt;
            setLocation(getX(), (int)ht);
            ho=ht;*/
        checkKeys();
        checkFall();
    
    } 
    
    public void checkKeys()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            shoot();
        }
        
        if((Greenfoot.isKeyDown("up")==true) && (getY()>(getWorld().getHeight()-475)))
        {
            jump();
        }
        if(Greenfoot.isKeyDown("down"))
        {
           
            fall();
        }
        
    }
   public void checkFall()
    {
       setLocation(getX(), getY() + vSpeed);
       vSpeed=2;
    }
   
    public void jump()
    {
        vSpeed = -jumpStrength;
        fall();
    }
    public void fall()
    {
        setLocation( getX(), getY() + vSpeed);
        vSpeed= vSpeed + acceleration+2;
    }
    public void shoot()
    {
        getWorld().addObject(new Bullet(), getX(), getY());
        new Bullet().setRotation(getRotation());
    }
     public void hitEnemy()
    {
        Actor en= getOneIntersectingObject(Enemy.class);
        if(en!=null)
        {
            World myWorld = getWorld();
            MyWorld mw = (MyWorld)myWorld;
            HealthBar hb=mw.getHealthBar();
            if(touch == false)
            {
                hb.looseHealth();
                touch =true;
            }
            //myWorld.removeObject(ths);
        }
    }
}
