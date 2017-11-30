import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WaterWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class WaterWorld extends World
{
    //HealthBar hb = new HealthBar();
    private BgScroll[] bg = new BgScroll[3];
    private final int LEFT_BOUNDARY = -300;
    private final int RIGHT_BOUNDARY = 600;
    //GreenfootSound myMusic= new GreenfootSound("Underwater Theme.mp3");
    
    /**
     * Constructor for objects of class WaterWorld.
     * 
     */
    public WaterWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        
        waterninja n = new waterninja();
        Fish f1 = new Fish();
        Fish f2 = new Fish();
        Fish f3 = new Fish();
        Fish f4 = new Fish();
        Fish f5 = new Fish();
        Fish f6 = new Fish();
        Starfish f7 = new Starfish();
        Starfish f8 = new Starfish();
        Starfish f9 = new Starfish();
        Starfish f10 = new Starfish();
        addObject(n, 15, 270);
        addObject(f1, 120, 225);
        addObject(f9, 225, 450);
        addObject(f3, 345, 600);
        addObject(f4, 600, 45);
        addObject(f7, 250, 15);
        //addObject(f8, 600, 80);
        addObject(f2, 675, 525);
        addObject(f10, 525, 525);
        //addObject(hb, 60, 15);
        Mermaid m=new Mermaid();
        addObject(m,750,38);
        Bubbles b = new Bubbles();
        addObject(b,750,38);
        

    }
     public void scroll(int direction)
    {
        for(int i=0; i< bg.length; i++)
        {
            bg[i].setLocation(bg[i].getX()+direction, bg[i].getY() );
        }
    }
    public void act()
    {
        //myMusic.play();
        //if(Greenfoot.isKeyDown("left")) 
        //{
          //  scroll(5);
        //}
        //if(Greenfoot.isKeyDown("right"))
        //{
          //  scroll(-5);
        //}
        //myMusic.play();
    }
    

}
