import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
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
    int i = 1;
    int health = 100;
    int gradient = 2;
    public void oscilate(){
    
        if(this.getY()==50){
       gradient = 2;
    }
    if(this.getY()==550){
       gradient = -2;
    }
     this.setLocation(this.getX(), this.getY()+gradient);
    }
    public void getHit(){
        
    }
    public void shoot(){
        
            if(i%200==0){
                Random rand = new Random();
                int n = rand.nextInt(3)+1;
                WeaponFactory wf = new WeaponFactory();
                World w;
                w = getWorld();
                w.addObject(wf.MakeWeapon(n), getX(), getY());
            }
                i++;
    
    }
    public void act() 
    {
        // Add your action code here.
        oscilate();
        shoot();
        Actor a = getOneIntersectingObject(bulletTemplate.class);
        if(a!=null){
            World  w = getWorld();
            health-= ((bulletTemplate)a).getPower();
            //GreenfootImage image = new GreenfootImage();
            //image.drawString("abc", 250,250);
            w.removeObject(a);
            
        }
        getWorld().showText("Health left: " + health, 820, 580);
        if(health<=0){
            getWorld().removeObject(this);
            Greenfoot.setWorld( new  success());
        }
    }    
}
