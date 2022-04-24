import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class SuperMarket extends World
{


    public SuperMarket()
    {    
        super(800, 600, 1); 
        prepare();
    }
    public void act()
    {
        addHandshake();
        addSpinach();
        addKabasura();
        checkScore();
        checkLife();
    }

    public void addSpinach()
    {
       if(Greenfoot.getRandomNumber(600)<1)
        {
            addObject(new Spinach(),Greenfoot.getRandomNumber(800),0);
        } 
    }
    public void addKabasura()
    {
        if(Greenfoot.getRandomNumber(1000)<1)
        {
            addObject(new Kabasura(),Greenfoot.getRandomNumber(800),0);
        }
    }
     public void addHandshake()
    {
        if(Greenfoot.getRandomNumber(200)<1)
        {
            addObject(new Handshake(),Greenfoot.getRandomNumber(800),0);
        }
    }
    public void checkScore()
    {
        if(Counter.Score>=10)
        {
            Greenfoot.delay(50);
            Greenfoot.setWorld(new Level4());
            Counter.Score=0;
        }
    }
    public void checkLife()
    {
        if(Morty.life==0)
        {
            removeObjects(getObjects(null));
            Morty.life=3;
            Life.Life=3;
            this.setBackground("Ambulance.jpg");
            Greenfoot.playSound("Ambulance.wav");
            Greenfoot.delay(500);
            Greenfoot.setWorld(new SuperMarket());
            Counter.Score=0;
        }
    }
    private void prepare()
    {
        Morty morty=new Morty();
        addObject(morty,100,200);
        morty.setLocation(265,525);
        
        Life.Life=3;
        Life l=new Life();
        addObject(l,50,50);
        l.setLocation(700,15);
        
        Counter counter=new Counter();
        addObject(counter,50,50);
        counter.setLocation(50,15);
        
        GreenfootSound music=new GreenfootSound("music_3.wav");
        if(!music.isPlaying())
        {
            music.play();
        }
    }
}
