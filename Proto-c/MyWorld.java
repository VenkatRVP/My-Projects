import greenfoot.*;

public class MyWorld extends World
{
    private final int START = 1;
    private final int DIRECTIONS = 2;
    private final int LEVEL1 = 3;
    private final int LEVEL2 = 4;
    private final int LEVEL3 = 5;
    private final int LEVEL4 = 6;
    private int state;

    public MyWorld()
    {    
        
            super(800, 600, 1);
            this.setBackground("Start.jpg");
            state = START;
    }
    
    public void act()
    {
        if (state == START && Greenfoot.isKeyDown("space"))
        {
            this.setBackground("Level1E1.jpg");
            Greenfoot.delay(30);
            state = DIRECTIONS;
            
        }
        
        if(state==DIRECTIONS && Greenfoot.isKeyDown("space"))
        {
            this.setBackground("Level1E2.jpg");
            Greenfoot.delay(30);
            state=LEVEL1;
            
        }
     
        if(state==LEVEL1 && Greenfoot.isKeyDown("space"))
        {
            this.setBackground("Level1E3.jpg");
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
            this.setBackground("Levelinstructions1.jpg");
            Greenfoot.delay(30);
            state=LEVEL4;
            
        }
        if(state==LEVEL4 && Greenfoot.isKeyDown("space"))
        {
            this.setBackground("Level1.jpg");
            Greenfoot.delay(30);
            Greenfoot.setWorld(new Home());
            
        }
    }
}
