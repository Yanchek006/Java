package com.task2_1;
import java.lang.*;
public class Author
{
    //int, long, byte, short, float, boolean, double, char это примитивные типы..
    // которые не содержатся в куче.. и немного быстрее работают.. а String это обычный класс..
    private String name;

    private String email;
    private char gender;

    public Author(String n, String e, char g)//Конструктор – это специальный метод класса, который имеет то же имя,
    //что используется в качестве имени класса.
    {
        name = n;
        email = e;
        gender = g;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public char getGender()
    {
        return gender;
    }
//Геттер (от англ. get - получить) — это метод, который получает значение определённого свойства.
// Сеттер (от англ. set — присвоить) — это метод, который присваивает значение определённому свойству объекта
    public void setEmail(String email)
    {
        this.email = email;
        //это ключевое слово является ссылкой на текущий объект, метод которого вызывается.
        //this сошлется на вызвавший объект
        //Как правило, применять this нужно в двух случаях:
        //Когда у переменной экземпляра класса и переменной метода/конструктора одинаковые имена;
        //Когда нужно вызвать конструктор одного типа (например, конструктор по умолчанию или параметризированный)
        // из другого. Это еще называется явным вызовом конструктора.
    }
    //Метод toString() – используется в Java для получения строкового объекта,
    // представляющего значение числового объекта, другими словами – преобразует число в строку.
    public String toString()
    {
        return this.name+"("+this.email+")"+" at "+this.email;
    }
}