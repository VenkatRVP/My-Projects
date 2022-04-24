import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5 extends World
{
    private final int START = 1;
    private final int DIRECTIONS = 2;
    private final int LEVEL1 = 3;
    private final int LEVEL2 = 4;
    private final int LEVEL3 = 5;
    private int state;
    public Level5()
    {    
        super(800, 600, 1);
        this.setBackground("Qualified.jpg");
        state=START;
    }
    public void act()
    {
        
        if (state == START && Greenfoot.isKeyDown("space"))
        {
            //this.setBackground("Qualified.jpg");
            //Greenfoot.delay(50);
            this.setBackground("Level5E1.jpg");
            Greenfoot.delay(30);
            state = DIRECTIONS;
            
        }
        if(state==DIRECTIONS && Greenfoot.isKeyDown("space"))
        {
            this.setBackground("Controls_3.jpg");
            Greenfoot.delay(30);
            state=LEVEL1;
        }
        if(state==LEVEL1 && Greenfoot.isKeyDown("space"))
        {
            this.setBackground("Level5.jpg");
            Greenfoot.delay(30);
            state=LEVEL2;
            Greenfoot.setWorld(new TheEndGame());
        }
    }
    
}
