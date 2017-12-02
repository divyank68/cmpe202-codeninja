import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    private int jeda=0;
    GreenfootSound myMusic= new GreenfootSound("Skip_-_01_-_HyperSpaceAdventure.mp3");
    
    private Background1[] bg = new Background1[3];
    
    
    FirePower fwp= new FirePower();
    private final int LEFT_BOUNDARY = -300;
    private final int RIGHT_BOUNDARY = 900;
   int counter=0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
     
        super(900, 600, 1, false);
        int x = LEFT_BOUNDARY;
        int count=0;
        
        for(int i=0; i<bg.length; i++)
        {
            bg[i] = new Background1();
            addObject( bg[i], x, getHeight()/2);
            x=x+ 600;
           
            
        }
        addObject( new Person(), getWidth()/2, 190);
       
        
       //getWorld().addObject(fwp.create(millis = (int)System.currentTimeMillis() % 2), getX(), getY());
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
        counter++;
        
        myMusic.play();
        if(Greenfoot.isKeyDown("left")) 
        {
            scroll(5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            scroll(-5);
        }
        if(Greenfoot.isKeyDown("c")){
        addObject(fwp, getWidth()/2, 290);
    }
        
         if(jeda>0)jeda--;
        else jeda=20;
        if(jeda==1)
        {  
            int py = Greenfoot.getRandomNumber(getHeight());
            addObject(new Enemy(-(2+Greenfoot.getRandomNumber(3))), getWidth()+200,py);
           
               
//int py = Greenfoot.getRandomNumber(getHeight());//addObject(new FireWorldPower(), 500, 200);

if (counter % 10 == 0)
{
            addObject(new FirePower(-(2+Greenfoot.getRandomNumber(10))), getWidth()+200,py);
        
        }
    }
       
    }
    
    
    
    

   

}
