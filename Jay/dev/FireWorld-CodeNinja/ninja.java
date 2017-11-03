// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class ninja extends Actor
{
    private int speed = 3;
    private Actor under;
    private int vspeed = 0;
    private int fireballs = 0;
    private int shuriken = 0;

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
        killed();
    }

    /**
     * 
     */
    private void fire()
    {
        fireballs suri1 =  new  fireballs();
        getWorld().addObject(suri1, getX(), getY());
        suri1.setRotation(getRotation());
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
            
        }
    }

    /**
     * 
     */
    public void killed()
    {
        if (isTouching(barrier.class)) {
            getWorld().removeObject(this);
            
        }
    }
}
