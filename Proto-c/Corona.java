import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Corona extends Actor
{

    public void act() 
    {
        moveCorona();
        removefromWorld();
    }   
    
    public void moveCorona()
    {

            setLocation(getX(),getY()+5);

    }
    public void removefromWorld()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
            
        }
    }
}

