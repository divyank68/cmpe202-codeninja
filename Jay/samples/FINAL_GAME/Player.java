import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    bulletTemplate b = new Waterbullet();
    int health = 10;
    int gravity =5;
    public void fall(){
        if((getOneIntersectingObject(Step1.class)==null)){
            setLocation(getX(), getY()+3);
            
        }
         /*if(getOneIntersectingObject(BottomBorder.class)==null){
            setLocation(getX(), getY()+3);
            
        }*/
    }
    public void jump(){
        if(Greenfoot.isKeyDown("space")){
            setLocation(getX(), getY()-8);
        }
    }
    public void fire(){
        if(Greenfoot.isKeyDown("x")){
            b= new Firebullet();
            getWorld().addObject(b, getX(),getY());
        }
        if(Greenfoot.isKeyDown("z")){
            b=new Waterbullet();
            getWorld().addObject(b, getX(),getY());
        }
        if(Greenfoot.isKeyDown("c")){
            b= new WindBullet();
            getWorld().addObject(b, getX(),getY());
        }
    }
    public void move(){
        if(Greenfoot.isKeyDown("left")){
            move(-2);
        }
        if(Greenfoot.isKeyDown("right")){   
            move(2);
        }
    }
    public void reduceHealth(){
        //Actor a = getOneIntersectingObject(bulletTemplate.class);
        if(getOneIntersectingObject(WaterWeapon.class)!=null){
            this.health-=3;
            getWorld().removeObject(getOneIntersectingObject(WaterWeapon.class));
        }
        if(getOneIntersectingObject(FireWeapon.class)!=null){
            this.health-=5;
            getWorld().removeObject(getOneIntersectingObject(FireWeapon.class));
        }
        if(getOneIntersectingObject(WindWeapon.class)!=null){
            this.health-=6;
            getWorld().removeObject(getOneIntersectingObject(WindWeapon.class));
        }
    }
    public void die(){
        if(this.health <= 0){
            getWorld().removeObject(this);
            Greenfoot.setWorld( new  GameOver4());
        }
    }
    public void act() 
    {
        fire();
        fall();
        jump();
        move();
        reduceHealth();
        
        getWorld().showText("Health left: " + health, 100, 580);
        die();
        // Add your action code here.
    }    
}
