import greenfoot.*;  

public class Iron extends Actor
{

    public void act() 
    {
        moveIron();
        removefromWorld();
    } 
    public void moveIron()
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
