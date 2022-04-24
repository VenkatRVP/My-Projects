import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pharmacy extends World
{

    public Pharmacy()
    {    
        super(800, 600, 1); 
        prepare();
    }
    public void act()
    {
        addZinc();
        addIron();
        addSanitizer();
        addCorona();
        checkScore();
        checkLife(); 
    }
    public void checkScore()
    {
        if(Counter.Score>=10)
        {
            Greenfoot.delay(50);
            Greenfoot.setWorld(new Level5());
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
            Greenfoot.delay(50);
            
            Counter.Score=0;
            Greenfoot.setWorld(new Pharmacy());

        }
    }
    public void addZinc()
    {
        if(Greenfoot.getRandomNumber(600)<1)
        {
            addObject(new Zinc(),Greenfoot.getRandomNumber(800),0);
        }
    }
    public void addCorona()
    {
      if(Greenfoot.getRandomNumber(80)<1)
        {
            addObject(new Corona(),Greenfoot.getRandomNumber(800),0);
        }  
    }
    public void addIron()
    {
        if(Greenfoot.getRandomNumber(800)<1)
        {
            addObject(new Iron(),Greenfoot.getRandomNumber(800),0);
        }
    }
    public void addSanitizer()
    {
        if(Greenfoot.getRandomNumber(1200)<1)
        {
            addObject(new Sanitizer(),Greenfoot.getRandomNumber(800),0);
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
        
        GreenfootSound music=new GreenfootSound("music_4.wav");
        if(!music.isPlaying())
        {
            music.play();
        }
    }
}
