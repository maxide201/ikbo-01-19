package com.company;

public class TestBall
{
    public static void main(String []args)
    {
        Ball ball = new Ball(1.2, 2.5);
        System.out.println(ball);
        ball.move(12, -2.5);
        System.out.println(ball);
    }
}
