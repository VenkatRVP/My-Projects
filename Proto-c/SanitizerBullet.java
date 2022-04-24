import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SanitizerBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SanitizerBullet extends Actor
{
    
    public void act() 
    {
        
        shotmove();
        removefromworld();
    }   
    public void shotmove()
    {
          setLocation(getX()+5,getY());
    }
    public void removefromworld()
        {
            Actor enemy=getOneIntersectingObject(BigCorona.class);
            if(enemy!=null)
            {
                getWorld().removeObject(this);
                BigCorona.life=BigCorona.life-10;
                
            }
            else
            if(isAtEdge())
            {
                getWorld().removeObject(this);
            }
           
            
        }
}
