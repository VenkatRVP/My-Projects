
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Precautions extends Actor
{

    public void act() 
    {
        
    }
    
    public void movePrecaution()
    {

            setLocation(getX(),getY()+3);

    }
    
    public void movePrecaution1()
    {

            setLocation(getX(),getY()+3);

    }
    
    public void removefromWorld()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
