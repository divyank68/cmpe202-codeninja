import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingBrick extends Actor
{
    /**
     * Act - do whatever the MovingBrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter= 0;
     public MovingBrick(){
    }
    public MovingBrick(int x, int y){
        GreenfootImage image = getImage();
        image.scale(x,y);
        setImage(image);
    }
    void move(){
        int  x, y;
        x= getX();
        y= getY();
        
        if(counter>=0&&counter<20){
            setLocation(x++,y);
            counter--;
        }
        else{
            setLocation(x--,y);
            if(counter>=-20){
            counter=20;
            }
        }
    }
    public void act() 
    {
        move();
        int  x, y;
        x= getX();
        y= getY();
         this.setLocation(x++,y);
        // Add your action code here.
    }    
}
