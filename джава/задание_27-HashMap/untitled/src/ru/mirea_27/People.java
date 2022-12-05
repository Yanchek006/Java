package ru.mirea_27;

import java.util.HashMap;

public class People {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap <String, String>();
        map.put("Толстой", "Стефан");
        map.put("Пурин", "Денни");
        map.put("Калимов", "Денни");
        map.put("Сухов", "Марк");
        map.put("Регинов", "Леам");
        map.put("Ретригер", "Денни");
        map.put("Ломов", "Марк");
        map.put("Адреналинова", "Леам");
        map.put("Карамзин", "Леам");
        map.put("Цуфаев", "Стефан");
        return map;
    }
    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String s : map.values())
            if (s.equals(name))
                count += 1;
        return count;
    }
    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (String s : map.keySet())
            if (s.equals(lastName))
                count += 1;
        return count;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        System.out.println(map);
        System.out.println("Количество людей с одинаковыми именами:");
        System.out.println(getCountTheSameFirstName (map, "Леам" ));
        System.out.println("Количество людей с одинаковыми фамилиями:");
        System.out.println(getCountTheSameLastName (map, "Калимов" ));

    }

}