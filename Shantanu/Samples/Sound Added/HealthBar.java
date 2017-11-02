import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Person
{
    int health=4;
    int healthBarWidth=80;
    int healthBarHeight=15;
    int pixelPerHealthPoint= (int)healthBarWidth/health;
    
   public HealthBar()
   {
       update();
    }
    public void act() 
    {
        update();
    }
        public void update()
        {
            setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
            GreenfootImage myImage = getImage();
            myImage.setColor(Color.WHITE);
            myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
            myImage.setColor(Color.RED);
            myImage.fillRect(1, 1, health*pixelPerHealthPoint, healthBarHeight);
            
        }
        public void looseHealth()
        {
            health--;
        }
}
