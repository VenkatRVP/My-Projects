import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Road extends World
{

    public Road()
    {    
        super(800, 600, 1);
        
        prepare();
    }
     public void act()
    {
        addInfectedPerson();
        Plus2();
        Plus5();
        Plus10();
        checkScore();
        checkLife();

    }
    public void Plus2()
    {
        if(Greenfoot.getRandomNumber(600)<1)
        {
            addObject(new plus2(),800,Greenfoot.getRandomNumber(600));
        }        
    }
    public void Plus5()
    {
        if(Greenfoot.getRandomNumber(800)<1)
        {
            addObject(new plus5(),800,Greenfoot.getRandomNumber(600));
        }        
    }
    public void Plus10()
    {
        if(Greenfoot.getRandomNumber(1000)<1)
        {
            addObject(new plus10(),800,Greenfoot.getRandomNumber(600));
        }
    }
    public void addInfectedPerson()
    {
        if(Greenfoot.getRandomNumber(250)<1)
        {
            addObject(new Infectedperson(),800,Greenfoot.getRandomNumber(600));
        }        
    }
    public void checkScore()
    {
        if(Counter_2.Distance>=10)
        {
            Greenfoot.delay(50);
            Greenfoot.setWorld(new Level3());
            Morty.life=3;
            Counter_2.Distance=0;
        }
    }
    public void checkLife()
    {
        if(Morty2.life==0)
        {
            removeObjects(getObjects(null));
            Morty2.life=3;
            Life.Life=3;
            this.setBackground("Ambulance.jpg");
            Greenfoot.playSound("Ambulance.wav");
            Greenfoot.delay(50);
            Greenfoot.setWorld(new Road());
            Counter_2.Distance=0;
        }
    }
    private void prepare()
    {
        Morty2 morty=new Morty2();
        addObject(morty,100,200);
        morty.setLocation(100,300);
        
        Life.Life=3;
        Life l=new Life();
        addObject(l,50,50);
        l.setLocation(700,15);
        
        Counter_2 counter=new Counter_2();
        addObject(counter,80,50);
        counter.setLocation(100,20);
        
        GreenfootSound music=new GreenfootSound("music_2.wav");
        if(!music.isPlaying())
        {
            music.play();
        }
    }
    
}
