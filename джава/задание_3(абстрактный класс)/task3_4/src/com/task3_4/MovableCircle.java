package com.task3_4;
//два класса MovablePoint и MovableCircle - которые реализуют
//интерфейс Movable
//новый класс MovableRectangle (движущийся прямоугольник). Его
//можно представить как две движущиеся точки MovablePoints (представляющих
//верхняя левая и нижняя правая точки) и реализующие интерфейс Movable.
public class MovableCircle implements Movable
{
    public int radius;
    public MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }


    public void moveUp()
    {
        center.moveUp();
    }


    public void moveDown()
    {
        center.moveDown();
    }


    public void moveLeft()
    {
        center.moveLeft();
    }


    public void moveRight()
    {
        center.moveRight();
    }


    public String toString() {
        return "MovableCircle: " +
                "radius=" + radius +
                ", center=" + center;
    }
}