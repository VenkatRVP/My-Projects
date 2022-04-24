import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zinc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zinc extends Actor
{
    /**
     * Act - do whatever the Zinc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       moveZinc();
       removefromWorld();
    }
    public void moveZinc()
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
