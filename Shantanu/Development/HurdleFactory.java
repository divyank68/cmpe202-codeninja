import greenfoot.*;

public class HurdleFactory extends Creator 
{
    public Actor getCreator()
    {
        return new Enemy();
    }
   
}
