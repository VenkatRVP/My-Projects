import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level4 extends World
{
    private final int START = 1;
    private final int DIRECTIONS = 2;
    private final int LEVEL1 = 3;
    private final int LEVEL2 = 4;
    private final int LEVEL3 = 5;
    private int state;
    public Level4()
    {    
        super(800, 600, 1);
        this.setBackground("Qualified.jpg");
        state=START;
    }
    public void act()
    {
        if (state == START && Greenfoot.isKeyDown("space"))
        {
            this.setBackground("Level4E1.jpg");
            Greenfoot.delay(30);
            state = DIRECTIONS;
            
        }
        if (state == DIRECTIONS && Greenfoot.isKeyDown("space"))
        {
            this.setBackground("Level4E2.jpg");
            Greenfoot.delay(30);
            state = LEVEL1;
            
        }
        if(state==LEVEL1 && Greenfoot.isKeyDown("space"))
        {
            this.setBackground("Levelinstructions4.jpg");
            Greenfoot.delay(30);
            state=LEVEL2;
        }
        if(state==LEVEL2 && Greenfoot.isKeyDown("space"))
        {
            this.setBackground("Controls.jpg");
            Greenfoot.delay(30);
            state=LEVEL3;
        }
        if(state==LEVEL3 && Greenfoot.isKeyDown("space"))
        {
            this.setBackground("Level4.jpg");
            Greenfoot.delay(30);
            Greenfoot.setWorld(new Pharmacy());
        }
    }
    
}
