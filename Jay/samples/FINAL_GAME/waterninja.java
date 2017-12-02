import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ninja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class waterninja extends Actor 
{
    int y=0;
    int g=1;
    int shots=5;
    AccessSplash sp;
    
    /**
     * Act - do whatever the Ninja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public waterninja(){
    
        GreenfootImage image = getImage();  
        image.scale(60, 40);
        setImage(image);
        sp=new AccessSplash();
    }
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(),getY()+y);
        if(Greenfoot.isKeyDown("up")==true)
        {
            y=-10;
        }
        if(Greenfoot.isKeyDown("right")==true)
        {
            move(5);
        }
        if(Greenfoot.isKeyDown("left")==true)
        {
            move(-5);
        }
        y=y+g;
        checkKeys();
        checkObstacle();
        
        levelup();
        
        if(isTouching(Starfish.class))
        {
            World world=getWorld();
            world.removeObjects(world.getObjects(null));
            Greenfoot.setWorld( new  GameOver3());
            //Greenfoot.stop();
            //getMusic().stop;
            return;
        }
    }
    public void checkKeys()
    {
        if(shots>0 && "space".equals(Greenfoot.getKey()))
        {
            getWorld().addObject(sp.returnNewSplash(),getX(),getY());
            shots--;
        }
        if(shots==0)
        {

            World world=getWorld();
            //Greenfoot.stop();
            

            
        }
    }
    public void checkObstacle()
    {
        if(shots>0)
        {
        Actor obs=getOneIntersectingObject(Fish.class);
        if(obs!=null)
        {
            move(-30);
            World myWorld = getWorld();
            WaterWorld mw = (WaterWorld)myWorld;
            //HealthBar hb=mw.getHealthBar();
            //hb.looseHealth();
        }
    }
    } 
    public void gameover()
    {
        
        if(isTouching(Starfish.class))
        {
            World world=getWorld();
            world.removeObjects(world.getObjects(null));
            Greenfoot.setWorld( new  GameOver());
            //Greenfoot.stop();
            //getMusic().stop;
        }
        
    
    }
    
     public void levelup()
    {
        
        if(isTouching(Mermaid.class))
        {
           
            Greenfoot.setWorld( new  levelup3());
            //Greenfoot.stop();
            //getMusic().stop;
        }
        
    
    }
}
