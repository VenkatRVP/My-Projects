import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plus5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class plus5 extends Actor
{
     public plus5()
    {
        setRotation(360);
    }
    public void act() 
    {
        movePlus5();
        removefromWorld();
    } 
        public void movePlus5()
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
