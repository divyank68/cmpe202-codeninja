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
       if(isBarrier()){
            if(Greenfoot.isKeyDown("left")){
                move(-2);
            }
            if(Greenfoot.isKeyDown("right")){
                move(2);
            }
        }
    }
    public boolean isBarrier(){
    Actor mb;
    Actor tw;
    Actor w;
    mb = getOneObjectAtOffset(18,18, MovingBrick.class);
    tw = getOneObjectAtOffset(18,18, TempWall.class);
    w = getOneObjectAtOffset(18,18, wall.class);
        if(mb != null || tw !=null || w !=null){
            return false;    
        }
        else
            return true;
    }
    
    public void act() 
    {
        // Add your action code here.
        move();
    }    
}
