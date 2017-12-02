import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RocketFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RocketFactory 
{
   
    public Actor createRocjet(int type){
      if(type == 0){
        return new BallRocket();
      }		
      else{
         return new NormalRocket();
         
      }
    }
}
    
