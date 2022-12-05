package com.task3;
import java.lang.*;
public class Circle extends Shape
{
    private final double PI=3.1416;
    protected double radius;

    public Circle(){}

    public Circle (double radius)
    {
        this.radius = radius;
    }

    public Circle (double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }


    public double getArea()
    {
        return radius*radius*PI;
    }


    public double getPerimeter()
    {
        return 2*PI*radius;
    }


    public String toString() {
        return "Area= "+ (radius*radius*PI) +
                ", Perimeter= " + (2*PI*radius) +
                ", color= " + color +
                ", filled= " + filled ;
    }
}