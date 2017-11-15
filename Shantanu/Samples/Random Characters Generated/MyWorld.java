import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    GreenfootSound myMusic= new GreenfootSound("Skip_-_01_-_HyperSpaceAdventure.mp3");
    private Background1[] bg = new Background1[3];
    
    HealthBar hb = new HealthBar();
    
    private final int LEFT_BOUNDARY = -300;
    private final int RIGHT_BOUNDARY = 900;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1, false);
        int x = LEFT_BOUNDARY;
        for(int i=0; i<bg.length; i++)
        {
            bg[i] = new Background1();
            addObject( bg[i], x, getHeight()/2 );
            x=x+ 600;
        }
        addObject( new Person(), getWidth()/2, 190);
        addObject(hb, 200, 40);
        prepare();
    }
    
    public HealthBar getHealthBar()
    {
        return hb;
        
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
        myMusic.play();
        if(Greenfoot.isKeyDown("left")) 
        {
            scroll(5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            scroll(-5);
        }
    }
    
    public void prepare()
    {
        addObject(hb, 200, 40);
        Enemy[] bee = new Enemy[7];
        for(int i=0; i<bee.length; i++)
        {
            bee[i] = new Enemy();
            int beeX = Greenfoot.getRandomNumber(getWidth());
            int beeY = Greenfoot.getRandomNumber(getHeight());
            addObject(bee[i], beeX, beeY);
        }
    
    }

}
