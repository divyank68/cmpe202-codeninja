import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WeaponFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WeaponFactory extends Actor
{
    /**
     * Act - do whatever the WeaponFactory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Actor MakeWeapon(int type){
      if(type == 0){
         return null;
      }		
      if(type == 1){
         return new WaterWeapon();
         
      } else if(type == 2){
         return new FireWeapon();
         
      } else if(type == 3){
         return new WindWeapon();
      }
      return null;
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
