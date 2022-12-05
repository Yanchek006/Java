package ru.task_9_2;
import java.util.*;

import java.util.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(3, "Марат"));
        list.add(new Student(5, "Бурак"));
        list.add(new Student(3, "Криштиан"));
        list.add(new Student(5, "Алисочка"));
        list.add(new Student(4, "Макар"));
        list.add(new Student(5, "Сонечка"));
        list.add(new Student(5, "Македоний"));
        list.add(new Student(3, "Тугарин"));
        list.add(new Student(4, "Добрыня"));
        list.add(new Student(4, "Лучезар"));

        int result = 5;
        printStudents(list, result);

        result = 4;
        printStudents(list, result);

        result = 3;
        printStudents(list, result);


    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Итоговые " + " баллы:" + course );

        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            Student student = iter.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());

            }
        }
    }
}

