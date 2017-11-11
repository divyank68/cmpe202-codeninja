import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class HealthBar extends Ninja
{
    int health=9;
    int healthBarWidth=60;
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
            setImage(new GreenfootImage(healthBarWidth, healthBarHeight));
            GreenfootImage myImage = getImage();
            myImage.drawRect(0, 0, healthBarWidth, healthBarHeight);
            myImage.setColor(Color.RED);
            myImage.fillRect(1, 1, health*pixelPerHealthPoint, healthBarHeight);
            
        }
        public void looseHealth()
        {
            
            if(health>1)
            {
                health=health-2;
            }
            
        }
}
