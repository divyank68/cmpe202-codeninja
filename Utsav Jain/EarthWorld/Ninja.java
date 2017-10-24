import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ninja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ninja extends Actor
{
    /**
     * Act - do whatever the Ninja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public Ninja(){
    }
    public Ninja(int x, int y){
        GreenfootImage image = getImage();
        image.scale(x,y);
        setImage(image);
    }
    public void move(){
        int x, y;
        x=this.getX();
        y=this.getY();
        
        if(Greenfoot.isKeyDown("left")){
            move(-2);
        }
        if(Greenfoot.isKeyDown("right")){
            move(2);
        }
    }
    public void act() 
    {
        // Add your action code here.
        move();
    }    
}
