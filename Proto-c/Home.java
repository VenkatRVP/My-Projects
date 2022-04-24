import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends World
{

    /**
     * Constructor for objects of class Home.
     * 
     */
    public Home()
    {    
        super(800, 600, 1); 
        prepare();
    }
    public void act()
    {
        addGlove();
        addMask();
        addHandshake();
        checkScore();
        checkLife();

    }
    public void checkScore()
    {
        if(Counter.Score>=10)
        {
            removeObjects(getObjects(null));
            Greenfoot.delay(50);
            Counter.Score=0;
            Greenfoot.setWorld(new Level2());

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
            Greenfoot.setWorld(new Home());
            Counter.Score=0;
            
        }
    }
    public void addGlove()
    {
        if(Greenfoot.getRandomNumber(600)<1)
        {
            addObject(new Glove(),Greenfoot.getRandomNumber(800),0);
        }
    }
    public void addMask()
    {
        if(Greenfoot.getRandomNumber(400)<1)
        {
            addObject(new Mask(),Greenfoot.getRandomNumber(800),0);
        }
    }
     public void addHandshake()
    {
        if(Greenfoot.getRandomNumber(400)<1)
        {
            addObject(new Handshake(),Greenfoot.getRandomNumber(800),0);
        }
    }
    private void initializeLevel1(){
        this.addObject(new Morty(), 100, 200);
        
        this.addObject(new Counter(), 500, 240);
    }


    private void prepare()
    {

        Morty morty=new Morty();
        addObject(morty,100,200);
        morty.setLocation(400,520);
        
        Life.Life=3;
        Life l=new Life();
        addObject(l,50,50);
        l.setLocation(700,15);  
        
        Counter counter=new Counter();
        addObject(counter,50,50);
        counter.setLocation(50,15);

        GreenfootSound music=new GreenfootSound("Gamemusic.wav");
        if(!music.isPlaying())
        {
            music.play();
        }
    }
}
