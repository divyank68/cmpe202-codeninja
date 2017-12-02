import greenfoot.*;
/**
 * Write a description of class AccessSplash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AccessSplash implements Proxy
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class AccessSpalsh
     */
    public AccessSplash()
    {
        
    }
    
    public Splash returnNewSplash(Actor a)
    {
        if(a.getClass().getSimpleName()=="waterninja")
        {
            return new Splash();
        }
        return null;
        
    }
}
