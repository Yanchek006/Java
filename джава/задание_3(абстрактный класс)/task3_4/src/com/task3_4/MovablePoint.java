package com.task3_4;
//Так вот конструкция public class Door implements Openable означает, что класс дверь реализует интерфейс
// «открывающийся». Следовательно класс должен переопределить все методы интерфейса.
// Главная фишка в том, что можно реализовывать сколь угодно много интерфейсов.

public class MovablePoint implements Movable
{
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public void moveDown()
    {
        y-=ySpeed;
    }


    public void moveUp()
    {
        y+=ySpeed;
    }


    public void moveLeft()
    {
        x-=xSpeed;
    }


    public void moveRight()
    {
        x+=xSpeed;
    }


    public String toString()
    {
        return "MovablePoint: " +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed;
    }
}