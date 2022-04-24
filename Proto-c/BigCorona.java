import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class BigCorona extends Actor
{
    static int life=300;
    boolean canFire=true;
    static int Y_move=3;
    public void act() 
    {
        setLocation(getX(),getY()+Y_move);
        if(isAtEdge())
        {
            Y_move=Y_move * -1;
        }
        shoot();
    } 
    public void shoot(){
        if(Greenfoot.getRandomNumber(1000)<8){
            getWorld().addObject(new EnemyBullet(), getX(), getY());
        }
    }
    

}
