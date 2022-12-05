package com.task3_2;

public class Square extends Rectangle
{
    double side;

    Square(){}

    Square(double side)
    {
        this.side = side;
    }

    Square(double side, String color, boolean filled)
    {
        this.side = side;
        this.color = color;
        this.filled = filled;
        setWidth(side);
        setLength(side);
    }

    public double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {
        this.side = side;
        setWidth(side);
        setLength(side);
    }


    public void setWidth(double side)
    {
        super.setWidth(side);
    }


    public void setLength(double side)
    {
        super.setLength(side);
    }

//super ключевое слово используется для вызова методов родительского класса в случае наследования.
//Каждый класс является дочерним Objectпо отношению к классу в java, и одним из его не конечных методов является toString().
//Итакsuper.toString(), вызывает Objectметод классаtoSting() .
    public String toString()
    {
        return super.toString();
    }
}