package ru.task_11_4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Time {
    void task1() {
        System.out.println("Введите дату в следующем формате: Год-Месяц-День Ч:М");
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");;
        String dateString = scanner.next();

        T_Date t_date = new T_Date();
        Date date = t_date.build(dateString);
        System.out.println(date);

        T_Calendar t_calendar = new T_Calendar();
        Calendar calendar = t_calendar.build(dateString);
        System.out.println(calendar);
    }

    void task2() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        String lastName;
        String receiptDateStr;

        lastName = scanner.next();
        System.out.println("Введите дату получения задания: Год-Месяц-День Ч:М");
        receiptDateStr = scanner.next();

        T_Calendar t_calendar = new T_Calendar();
        Calendar receiptDate = t_calendar.build(receiptDateStr);
        Main main = new Main( receiptDate);



        System.out.println(main);
    }

    public static void main(String[] args) {
        Time time = new Time();
        time.task1();
        time.task2();
    }
}