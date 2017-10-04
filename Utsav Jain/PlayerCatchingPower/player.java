import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int po = 0;
    void getbig()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 10, image.getHeight() + 10);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
        int x, y;
        x=this.getX();
        y=this.getY();
        if(Greenfoot.isKeyDown("a")){
            this.setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("d")){
            this.setLocation(getX()+5, getY());
        }
        Actor arrow;
        arrow = getOneIntersectingObject(power.class);  
        if (arrow != null)
        {
            getbig();
            po +=1;
            World world;
            world = getWorld();
            world.removeObject(arrow);
        }
}}
