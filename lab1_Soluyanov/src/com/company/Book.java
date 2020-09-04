package com.company;

public class Book
{
    private String name;
    private int pages;
    public Book(String name, int pages)
    {
        this.name = name;
        this.pages = pages;
    }
    public String getName() {return name;}
    public int getPages() {return pages;}

    public String toString()
    {
        return "Book: " +  name + " " + pages;
    }
}
