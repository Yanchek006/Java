package ru.task_9_4;

import java.util.TreeSet;

public class Example
{
    public static void main(String[] args)
    {
        TreeSet<Compare> data = new TreeSet<Compare>();
        data.add(new Compare("Начальная школа"  , 234));
        data.add(new Compare("Начальная школа"  , 132));
        data.add(new Compare("Средняя школа"    , 357));
        data.add(new Compare("Высшая школа"     , 246));
        data.add(new Compare("Музыкальная школа", 789));
        for (Compare e : data)
            System.out.println(e.toString());
    }
}
//значения сортируются сначала по полю str (по алфавиту), а затем по num в методе compareTo
// метод compareTo (Object obj), предназначенный для упорядочивания объектов класса