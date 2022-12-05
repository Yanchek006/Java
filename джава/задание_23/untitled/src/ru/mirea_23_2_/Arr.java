package ru.mirea_23_2_;

import java.util.ArrayList;

public class Arr {
    public static void main(String[] args) {
        ArrayList <String> countries = new ArrayList<>();
        countries.add("Germany");
        countries.add("Russia");
        countries.add("USA");

        System.out.println("Вывод элементов:");
        System.out.println(countries + " ");

        System.out.println("Длинна списка: ");
        System.out.println(countries.size());

        System.out.println("Вывод 3 элемента списка: ");
        System.out.println(countries.get(2));

        countries.set(2, "UK");
        System.out.println("Замена 3 элемента:");
        System.out.println(countries + " ");

        System.out.println("Вывод индекса элемента <UK>:");
        System.out.println(countries.indexOf("UK"));

        countries.remove(2);
        System.out.println("Удаление элемента 3:");
        System.out.println(countries + " ");
    }
}