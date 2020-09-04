package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Dog dog = new Dog("Sharik", "Alabay");
        Book book = new Book("untitled", 314);
        Ball ball = new Ball("Red", 4);

        System.out.println(dog.toString());
        System.out.println(book.toString());
        System.out.println(ball.toString());
    }
}
