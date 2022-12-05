package ru.mirea_23_2_;


import java.util.LinkedList;

public class Lin {
    public static void main(String[] args) {
        String str1 = "BMW ";
        String str2 = "Toyota";
        String str3 = "Mercedes";
        String str4 = "Volvo";

        LinkedList<String> marks = new LinkedList<>();
        marks.add(str1);
        marks.add(str2);
        marks.add(str3);
        marks.add(str4);

        System.out.println("Вывод элементов:");
        System.out.println(marks);

        System.out.println("Добавление элемента между 1 и 2 ссылками");
        marks.add(1, "Nissan");
        System.out.println(marks);

        System.out.println("Удаление последнего элемента");
        marks.pollLast();
        System.out.println(marks);

        System.out.println("Добавление в конец списка элемента");
        marks.addLast("Hyundai");
        System.out.println(marks);

        System.out.println("Возвращение массива элементов");
        String[] car = marks.toArray(new String[4]);
        for (int i=0; i<4; i++)
            System.out.println(car[i]);
    }
}