import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Level6 extends World
{
    private final int START = 1;
    private final int DIRECTIONS = 2;
    private int state;
    public Level6()
    {    
        super(800, 600, 1); 
        this.setBackground("Level6.jpg");
        state=START;
        
    }
    public void act()
    {
        if(state==START && Greenfoot.isKeyDown("Enter"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
        GreenfootSound music=new GreenfootSound("Mission.wav");
    }
}
