import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Morty3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Morty3 extends Actor
{
    static int life=100;
    boolean canFire=true;
    public void act() 
    {
        shoot();
        moveAround();
        if(isTouching(EnemyBullet.class))
        {
            removeTouching(EnemyBullet.class);
            Greenfoot.playSound("Corona_1.wav");
            life--;
            
        }
    }    
    public void shoot(){
        if(Greenfoot.isKeyDown("space") && canFire==true)
        {
            getWorld().addObject(new SanitizerBullet(), getX()+18, getY()-7);
            canFire=false;
        }
        else if(!Greenfoot.isKeyDown("space"))
        {
            canFire=true;
        }
    }
    public void moveAround()
    {
      if(Greenfoot.isKeyDown("up")){
         setLocation(getX(),getY()-5);
         //Greenfoot.playSound("fly.wav");
        }
      if(Greenfoot.isKeyDown("down")){
          setLocation(getX(),getY()+5);      
          //Greenfoot.playSound("fly.wav");
        }
    }
}
