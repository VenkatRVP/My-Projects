import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class plus10 extends Actor
{
    public plus10()
    {
        setRotation(360);
    }
    public void act() 
    {
        movePlus10();
        removefromWorld();
    } 
        public void movePlus10()
    {

            setLocation(getX()-3,getY());

    }
    public void removefromWorld()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }  
}
