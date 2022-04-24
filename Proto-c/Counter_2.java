import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Counter_2 extends Actor
{
    static int Distance=0;
    public void act() 
    {
       setImage(new GreenfootImage("Distance:"+Distance,30,Color.WHITE,Color.BLACK));
    }   
    public static void addDistance(int distance)
    {
        Distance=Distance+distance;
    }
}
