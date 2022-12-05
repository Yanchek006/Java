package com.task2;

public class Ball
{
    int r;
    final double PI=3.14;

    public Ball (int r)
    {
        this.r = r;
    }

    public int getR()
    {
        return r;
    }

    public void setR(int r)
    {
        this.r = r;
    }

    public double getArea()
    {
        return r*r*PI*4;
    }

    public String toString() {
        return "r=" + r +" Area= "+ getArea();
    }
}