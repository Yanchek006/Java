package com.task2_2;
import java.lang.*;

// Ball должен
//реализовывать сущность мяч, а другой с названием TestBall тестировать работу
//созданного класса
public class Ball
{
    private double x = 0.0; //с вещ-ми числами. описывают положение мяча на поле
    private double y = 0.0;
//Конструкторы, public методы получения и записи значений для private
//переменных.
    public Ball (double x, double y)
    {
        this.x = x; //это ключевое слово является ссылкой на текущий объект, метод которого вызывается.
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }
//Метод setXY (), который задает положение мяча и метод setXYSpeed(),
//чтобы задать скорость мяча
    public void setXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void move (double xDisp, double yDisp)
    {
        //Метод move() , позволяет переместить мяч, так что что увеличивает х и у
        //на данном участке на xDisp и yDisp, соответственно
        x+=xDisp;
        y+=yDisp;
    }
//Метод toString(), который возвращает "Ball @ (х , у) "
    //Всякий раз, когда мы печатаем ссылку на объект, он вызывает метод toString() внутри.
// Итак, если мы не определяем метод toString() в нашем классе, то вызывается Object#toString()
    //Возвращает строковое представление объекта. В общем случае toStringметод возвращает строку,
// которая "текстуально представляет" этот объект.
    public String toString()
    {
        return "Ball @ ("+this.x+", "+this.y+").";
    }
}