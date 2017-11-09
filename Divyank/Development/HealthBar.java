import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class HealthBar extends Ninja
{
    static int health=4;
    int healthBarWidth=50;
    int healthBarHeight=10;
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
            setImage(new GreenfootImage(healthBarWidth, healthBarHeight));
            GreenfootImage myImage = getImage();
            myImage.setColor(Color.GREEN);
            myImage.drawRect(0, 0, healthBarWidth, healthBarHeight);
            myImage.setColor(Color.RED);
            myImage.fillRect(1, 1, health*pixelPerHealthPoint, healthBarHeight);
            
        }
        public static void looseHealth()
        {
            health--;
        }
}
