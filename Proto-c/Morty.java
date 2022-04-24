import greenfoot.*;  

public class Morty extends Actor
{
    static int life=3;
    boolean flip=true;
    public void act() 
    {

        moveAround();
        if(isTouching(Mask.class))
        {
            removeTouching(Mask.class);
            Greenfoot.playSound("Glove_mask.wav");
            Counter.addScore(2);
        }
        else
        if(isTouching(Glove.class))
        {
            removeTouching(Glove.class);
            Greenfoot.playSound("Glove_mask.wav");
            Counter.addScore(5);
        }
        else if(isTouching(Spinach.class))
        {
            removeTouching(Spinach.class);
            Greenfoot.playSound("Glove_mask.wav");
            Counter.addScore(2);
        }
        else
        if(isTouching(Kabasura.class))
        {
            removeTouching(Kabasura.class);
            Greenfoot.playSound("sanitizer.wav");
            Counter.addScore(5);
        }
        else if(isTouching(Zinc.class))
        {
            removeTouching(Zinc.class);
            Greenfoot.playSound("Glove_mask.wav");
            Counter.addScore(2);
        }
        else
        if(isTouching(Iron.class))
        {
            removeTouching(Iron.class);
            Greenfoot.playSound("Glove_mask.wav");
            Counter.addScore(5);
        }
        else
        if(isTouching(Sanitizer.class))
        {
            removeTouching(Sanitizer.class);
            Greenfoot.playSound("sanitizer.wav");
            Counter.addScore(10);
        }
        
        
        else
        if(isTouching(Corona.class))
        {
            removeTouching(Corona.class);
            Greenfoot.playSound("Corona_1.wav");
            life--;
            Life.Life--;
            
        }
        else
        if(isTouching(Handshake.class))
        {
            removeTouching(Handshake.class);
            Greenfoot.playSound("Corona_1.wav");
            life--;
            Life.Life--;
            
        }
        
    }    

    public void moveAround()
    {
      if(Greenfoot.isKeyDown("right")){
         setLocation(getX()+5,getY());
         //Greenfoot.playSound("fly.wav");
        }
      if(Greenfoot.isKeyDown("left") && flip==true)
        {
           getImage().mirrorHorizontally();
           flip=false;
        }
      if(Greenfoot.isKeyDown("left")){
          setLocation(getX()-5,getY());      
          //Greenfoot.playSound("fly.wav");
        }
      if(Greenfoot.isKeyDown("right") && flip==false)
        {
           getImage().mirrorHorizontally();
           flip=true;
        }
      
    }

    
    
    
}
