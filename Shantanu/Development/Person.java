import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    GreenfootSound myMusic1= new GreenfootSound("Banana Peel.mp3");
   GreenfootSound myMusic2= new GreenfootSound("Mortar Round.mp3");
    public int c=0;
   //Counter counter=new Counter();
     private int targetx = 0, targety=0;
    private int jeda= 0;
    private boolean toRemove= false;
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
    if(toRemove){
        getWorld().removeObject(this);
        
        //myMusic2.play();
    }
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
        if(getY()>(getWorld().getHeight()-114))
        {
             c=1;
           World myWorld = getWorld();
            MyWorld mw = (MyWorld)myWorld;
            mw.removeObject(this);
            GreenfootSound myMusic= new GreenfootSound("Banana Peel.mp3");
           myMusic1.play();
            //myWorld.removeObjects(myWorld.getObjects(null));
        }
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
        myMusic2.play();
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
            myWorld.removeObject(this);
           
            //counter.addScore();
        }
    }
}
