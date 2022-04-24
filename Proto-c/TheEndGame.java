import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TheEndGame extends World
{


    public TheEndGame()
    {    
        
        super(800, 600, 1); 
        prepare();
    }
    public void act()
    {
        MortyLife();
        CoronaLife();
    }
    public void MortyLife()
    {
        if(Morty3.life<=0)
        {
            removeObjects(getObjects(null));
            Greenfoot.setWorld(new Level5());
            this.setBackground("Ambulance.jpg");
            Greenfoot.playSound("Ambulance.wav");
            Greenfoot.delay(50);
            Morty3.life=100;
        }
    }
    public void CoronaLife()
    {
        if(BigCorona.life<=0)
        {
            removeObjects(getObjects(null));
            Greenfoot.setWorld(new Level6());
            BigCorona.life=300;

            }
    }
    private void prepare()
    {

        Morty3 morty=new Morty3();
        addObject(morty,100,200);
        morty.setLocation(80,300);
        
        
        
        BigCorona big=new BigCorona();
        addObject(big,500,400);
        big.setLocation(500,400);
        GreenfootSound music=new GreenfootSound("music_5.wav");
        if(!music.isPlaying())
        {
            music.play();
        }
    }
    
    
}
