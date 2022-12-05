package ru.task_11_5;

public class Tester {
    public static void main(String[] args) throws InterruptedException {
        CompareDate compareDate = new CompareDate();
        compareDate.to();
        CompareDate compareDate1 = new CompareDate(2012, 9, 8);
        compareDate1.to1();
        System.out.println();
        compareDate1.compareCal();
        System.out.println();

        TimeCode timeCode = new TimeCode();
        timeCode.timeAdd("!");
        System.out.println();
        timeCode.timeFind("!");
        System.out.println();
        timeCode.timeInsert(2, "twelve");
        System.out.println();
        timeCode.timeDelete("!");
    }
}