import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Counter extends Actor
{
    static int Score=0;
    
    public Counter()
    {
        setImage(new GreenfootImage("Score:"+Score,30,Color.WHITE,Color.BLACK));
    }

    public void act() 
    {
        setImage(new GreenfootImage("Score:"+Score,30,Color.WHITE,Color.BLACK));
    } 
    public static void addScore(int score)
    {
        Score=Score+score;
    }

}
