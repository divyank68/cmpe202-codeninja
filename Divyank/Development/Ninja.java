import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ninja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Ninja extends Actor
{
    int y=0;
    int g=1;
    int shots=5;
    
    
    /**
     * Act - do whatever the Ninja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ninja(){
    
        GreenfootImage image = getImage();  
        image.scale(60, 40);
        setImage(image);
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
        gameover();
    }
    public void checkKeys()
    {
        if(shots>0 && "space".equals(Greenfoot.getKey()))
        {
            getWorld().addObject(new Splash(),getX(),getY());
            shots--;
        }
        if(shots==0)
        {
            World world=getWorld();
            //Greenfoot.stop();
            if(world!=null)
            {
                world.removeObjects(world.getObjects(null));
                world.setBackground("GameOver.jpeg");
            
            
            }
            
            
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
            HealthBar hb=mw.getHealthBar();
            hb.looseHealth();
        }
    }
    } 
    public void gameover()
    {
        
        if(isTouching(Starfish.class))
        {
            World world=getWorld();
            world.removeObjects(world.getObjects(null));
            world.setBackground("GameOver.jpeg");
            //getMusic().stop;
        }
    
    }
}
