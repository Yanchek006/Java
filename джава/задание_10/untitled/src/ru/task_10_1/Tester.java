package ru.task_10_1;
import java.util.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "Даниил","Варикадов","Юриспруденция",4));
        list.add(new Student(4, "Тимофей","Петров","Театральное",5));
        list.add(new Student(3, "Никита","Лопаткин","Журналистика",12));
        list.add(new Student(2, "Августина","Поясная","Информационная безопасность",8));
        list.add(new Student(1, "Милана","Полянина","Архитектурный",9));

        int course = 1;
        printStudents(list, course);

        course = 2;
        printStudents(list, course);

        course = 3;
        printStudents(list, course);

        course = 4;
        printStudents(list, course);
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты " + course + " курса:" );

        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            Student student = iter.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                System.out.println(student.getSurname());
                System.out.println(student.getSpecialization());
                System.out.println(student.getGroup());

            }
        }
    }
}

