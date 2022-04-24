import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class plus2 extends Actor
{
    public plus2()
    {
        setRotation(360);
    }
    public void act() 
    {
        movePlus2();
        removefromWorld();
    } 
        public void movePlus2()
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
