import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class fireninja extends Actor
{
    private int speed = 3;
    private Actor under;
    private int vspeed = 0;
    private int fireballs = 0;
    private int shuriken = 0;
    private boolean shuflag = false;
    private boolean fireflag = false;

    /**
     * Act - do whatever the ninja wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("down")) {
            setRotation(getRotation() - 5);
        }
        if (Greenfoot.isKeyDown("up")) {
            setRotation(getRotation() + 5);
        }
        if ("space".equals(Greenfoot.getKey())) {
            fire();
        }
        if (Greenfoot.isKeyDown("right")) {
            moveRight();
        }
        if (Greenfoot.isKeyDown("left")) {
            moveLeft();
        }
        if (onGround() || onBaseGround()) {
            vspeed = 0;
            
        }
        else {
            fall();
        }
        if (Greenfoot.isKeyDown("shift")) {
            jump();
        }
        getFireballs();
        getShriken();
        checkobstacles();
        if (isTouching(barrier.class) || isTouching(Bomb.class)||isTouching(barrel.class)) {
            getWorld().removeObject(this);
            return;
            
        }
        getWorld().showText("fireballs:"+fireballs,100,30);
        getWorld().showText("Shuriken:"+shuriken,200,30);
        if (isTouching(end.class))
        {
            Greenfoot.setWorld( new  levelup2());
        }
    }

    /**
     * 
     */
    private void fire()
    {

  
         if (shuriken > 0){
            fireShuri();
            shuriken = shuriken-1;
        }
        if (fireballs > 0) {
            fireBalls();
            fireballs =fireballs-1;
        }
    }
   
     public void fireBalls()
    {
       Wall fire =  new  Wall();
            getWorld().addObject(fire, getX(), getY());
            fire.setRotation(getRotation()); 
            fireflag= false;
    }
    
     public void fireShuri()
    {
       Wall suri1 =  new  Wall();

            getWorld().addObject(suri1, getX(), getY());
            suri1.setRotation(getRotation());
            shuflag =false;
    }

    /**
     * 
     */
    public void moveRight()
    {
        setLocation(getX() + speed, getY());
    }

    /**
     * 
     */
    public void moveLeft()
    {
        setLocation(getX() - speed, getY());
    }

    /**
     * 
     */
    public void fall()
    {
        setLocation(getX(), getY() + vspeed);
        vspeed = vspeed + 2;
    }

    /**
     * 
     */
    public boolean onGround()
    {
        under = getOneObjectAtOffset(0, getImage().getHeight() / 2, Bricks.class);
        return under != null;
    }

    /**
     * 
     */
    public boolean onBaseGround()
    {
        under = getOneObjectAtOffset(0, getImage().getHeight() / 2, BaseBrick.class);
        return under != null;
    }

    /**
     * 
     */
    public void jump()
    {
        vspeed = -5;
        fall();
    }

    /**
     * 
     */
    public void getFireballs()
    {
        if (isTouching(fireballs.class)) {
            if (fireballs == 3) {
                removeTouching(fireballs.class);
                fireballs = fireballs + 1;
                fireflag = true;
            }
            else {
                fireballs = fireballs + 1;
            }
        }
    }

    /**
     * 
     */
    public void getShriken()
    {
        if (isTouching(Shuriken.class)) {
            removeTouching(Shuriken.class);
            shuriken = shuriken + 1;
            shuflag = true;
            
        }
    }

    /**
     * 
     */
    public void killed()
    {
        if (isTouching(barrier.class) || isTouching(Bomb.class)) {
            getWorld().removeObject(this);
            return;
            
        }
    }

    /**
     * 
     */
    public void checkobstacles()
    {
        Actor bricks = getOneIntersectingObject(Bricks.class);
        if (bricks != null &&  ! onGround()) {
            move(-5);
        }
    }
}
