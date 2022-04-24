import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyBullet extends Actor
{
    boolean canFire=true;
    public void act() 
    {
        removefromworld();
    }    
    
    public void removefromworld()
        {
            
           int MOVE_SPEED = -8;
        
           this.move(MOVE_SPEED);
           if (this.getOneIntersectingObject(Morty3.class) != null) {
            Morty3 target = (Morty3)getOneIntersectingObject(Morty3.class);
            Morty3.life=Morty3.life-10;
            
        }
        if(this.isAtEdge()){
            getWorld().removeObject(this);
        }
            
        }
}
