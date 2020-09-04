package com.company;

public class Dog
{
    private String name;
    private String breed;
    public Dog(String name, String breed)
    {
        this.name = name;
        this.breed = breed;
    }
    public String getName() {return name;}
    public String getBreed() {return breed;}

    public String toString()
    {
        return "Dog: " +  name + " " + breed;
    }
}
