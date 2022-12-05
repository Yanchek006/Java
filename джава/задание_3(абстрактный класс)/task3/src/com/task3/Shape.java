package com.task3;
import java.lang.*;
//Абстрактные классы в Java могут содержать или не содержать абстрактные методы, т.е. методы без тела (public void get();)
//Если класс имеет хотя бы один абстрактный метод, то класс должен быть объявлен абстрактным
public abstract class Shape
{
    protected String color = "none"; //Поля и методы, обозначенные модификатором доступа protected, будут видны:
     // в пределах всех классов, находящихся в том же пакете, что и наш;
    //в пределах всех классов-наследников нашего класса.
    //Такие защищенные переменные могут быть доступны в подклассах и классах в одном пакете.
    protected boolean filled = false;

    public Shape (){}
    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public abstract double getArea(); //Класс, содержащий абстрактные методы, называется абстрактным классом
    public abstract double getPerimeter(); //Абстрактный метод внутри абстрактного класса не имеет тела, только
    //прототип. Он состоит только из объявления и не имеет тела


    public String toString()
    {
        return "color= " + color + ", filled=" + filled;
    }
}