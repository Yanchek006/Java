package ru.task_10_2;

import java.util.Comparator;
import java.lang.Comparable;

public class SortingStudentsByGPA implements Comparator {

    public int compare(Object o1, Object o2) {
        if(!(o1 instanceof Student && o2 instanceof Student))
            throw new IllegalArgumentException("Объекты не являются студентами!");

        return ((Student) o1).getGPA() - ((Student) o2).getGPA();
    }
}