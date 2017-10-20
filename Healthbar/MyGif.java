import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyGif extends Actor
{
    
    GifImage myGif= new GifImage("flying.gif");
    public void act() 
    {
        setImage(myGif.getCurrentImage() );
    }    
}
