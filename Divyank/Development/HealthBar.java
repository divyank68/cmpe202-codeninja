import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class HealthBar extends Ninja
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
            myImage.setColor(Color.GREEN);
            myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
            myImage.setColor(Color.RED);
            myImage.fillRect(1, 1, health*pixelPerHealthPoint, healthBarHeight);
            
        }
        public void looseHealth()
        {
            health--;
        }
}
