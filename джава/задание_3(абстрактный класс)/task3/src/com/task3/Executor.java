package com.task3;

public class Executor
{
    public static void main(String[] args)
    {
        Circle c = new Circle(20);
        Rectangle r = new Rectangle(4, 5);
        Square s = new Square(10, "yes", true);
        System.out.println(c);
        System.out.println(r);
        System.out.println(s);
    }
}