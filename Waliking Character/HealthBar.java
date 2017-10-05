import greenfoot.*; 



public class HealthBar extends Actor
{
    public HealthBar()
    {
    update();
}
    int health = 4;
    int healthBarWidth = 80;
    int healthBarHeight = 15;
    int pixelsPerHealthPoint = (int)healthBarWidth/health;
    public void act() 
    {
       update();
    }    
    
    public void update()
    {
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage= getImage();
        myImage.setColor(Color.BLACK);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
          myImage.setColor(Color.GREEN);
        myImage.fillRect(1, 1, health*pixelsPerHealthPoint, healthBarHeight);
}
     public void looseHealth()
        {
     health--;
} 
      }
