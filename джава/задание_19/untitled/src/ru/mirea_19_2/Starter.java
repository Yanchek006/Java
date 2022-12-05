package ru.mirea_19_2;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Серкан Болат", 99, 18, 25));
        s.add(new Student("Сулейман хан хазрет лери", 88, 12, 120));
        s.add(new Student("Бурак Озчивит", 68, 6, 40));
        s.add(new Student("Аныл Ильтер", 39, 19, 27));

        new LabClassUI(s);
    }

}