package com.task3;
import java.lang.*;
public class Rectangle extends Shape
{
    double width;
    double length;

    Rectangle(){};

    Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth()
    {
        return width;
    }

    public double getLength()
    {
        return length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getArea()
    {
        return width*length;
    }


    public double getPerimeter()
    {
        return 2*width+2*length;
    }


    public String toString()
    {
        return "Area= "+ (width*length) +
                ", Perimeter= " + (2*width+2*length) +
                ", color= " + color +
                ", filled= " + filled ;
    }
}