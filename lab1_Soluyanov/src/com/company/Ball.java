package com.company;

public class Ball
{
    private String color;
    private int radius;
    public Ball(String color, int radius)
    {
        this.color = color;
        this.radius = radius;
    }
    public String getColor() {return color;}
    public int getRadius() {return radius;}

    public String toString()
    {
        return "Ball: " +  color + " " + radius;
    }
}
