import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Spinach extends Actor
{

    public void act() 
    {
        moveSpinach();
        removefromWorld();
    }  
    public void moveSpinach()
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
