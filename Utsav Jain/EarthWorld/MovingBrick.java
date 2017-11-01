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
    int counter= 1;
     public MovingBrick(){
    }
    public MovingBrick(int x, int y){
        GreenfootImage image = getImage();
        image.scale(x,y);
        setImage(image);
    }
    void moveing(){
        
        /*if(counter>=0&&counter<20){
            move(2);
            counter--;
        }
        else{
            move(-2);
            if(counter>=-20){
            counter=20;
            }
        }*/
                    if(counter<50){
                     move(2);
                    }
                    else{
                        if(counter<100){
                            move(-2);
                        }
                        else{
                            counter =0;
                        }
                    }
                    counter++;
                                       
    }
    public void act() 
    {
        moveing();
        
        /*if(counter<50){
                     move(2);
                    }
                    else{
                        if(counter<100){
                            move(-2);
                        }
                        else{
                            counter =0;
                        }
                    }
                    counter++;
                */       
      //   //this.setLocation(x++,y);
        // Add your action code here.
    }    
}
