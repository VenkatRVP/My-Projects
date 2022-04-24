import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Morty2 extends Actor
{
    static int life=3;
    public void act() 
    {
        moveAround();
        if(isTouching(plus2.class))
        {
            removeTouching(plus2.class);
            Greenfoot.playSound("Glove_mask.wav");
            Counter_2.addDistance(2);
        }
        else
        if(isTouching(plus5.class))
        {
            removeTouching(plus5.class);
            Greenfoot.playSound("Glove_mask.wav");
            Counter_2.addDistance(5);
        }
        else
        if(isTouching(plus10.class))
        {
            removeTouching(plus10.class);
            Greenfoot.playSound("sanitizer.wav");
            Counter_2.addDistance(10);
        }
        else
        if(isTouching(Infectedperson.class))
        {
            removeTouching(Infectedperson.class);
            Greenfoot.playSound("Corona_1.wav");
            life--;
            Life.Life--;
            
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
