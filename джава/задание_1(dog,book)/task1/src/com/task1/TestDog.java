package com.task1;
import java.lang.*;

public class TestDog
{
    public static void main(String[] args)
    {
        Dog[] d = new Dog[3]; //создаем экземпляры класса
        //Экземпляр класса — это представление (или реализация) конкретного
        //представителя класса.

        d[0] = new Dog("Mike", 2);
        d[1] = new Dog("Helen", 7);
        d[2] = new Dog("Bob");
        d[2].setAge(3);
        System.out.println(d[0]);
        d[0].intoHumanAge();
        d[1].intoHumanAge();
        d[2].intoHumanAge();
    }
}