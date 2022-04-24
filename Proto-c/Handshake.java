import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Handshake extends Actor
{

    public void act() 
    {
        moveHandshake();
        removefromWorld();
    }   
    public void moveHandshake()
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
