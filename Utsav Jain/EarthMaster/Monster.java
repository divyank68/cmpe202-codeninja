import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Actor
{
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int gradient = 2;
    public void oscilate(){
    
        if(this.getY()>50){
       gradient = -2;
    }
    if(this.getY()<650){
       gradient = 2;
    }
     this.setLocation(this.getX(), this.getY()+gradient);
    }
    public void act() 
    {
        // Add your action code here.
        oscilate();
    }    
}
