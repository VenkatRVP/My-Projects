import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Kabasura extends Actor
{
    
    public void act() 
    {
        moveKabasura();
        removefromWorld();
    }    
    public void moveKabasura()
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
