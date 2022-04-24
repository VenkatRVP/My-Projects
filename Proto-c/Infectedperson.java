import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Infectedperson here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Infectedperson extends Actor
{
    /**
     * Act - do whatever the Infectedperson wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveInfecPerson();
        removefromWorld();       
    }
        public void moveInfecPerson()
    {

            setLocation(getX()-4,getY());

    }
    public void removefromWorld()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }    
}
