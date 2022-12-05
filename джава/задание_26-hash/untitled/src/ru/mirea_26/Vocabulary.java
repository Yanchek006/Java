package ru.mirea_26;
import java.util.HashMap;
import java.util.Map;
public class Vocabulary{
    public static void main(String[] args)
    {
        //создаем словарь из 10 элементов с ключами
        Map<Integer, String> persons = new HashMap<Integer, String>();
        persons.put(449870, "Василий");
        persons.put(476190, "Арсений");
        persons.put(401520, "Фома");
        persons.put(953710, "Мария");
        persons.put(563008, "Екатерина");
        persons.put(864997, "Михаил");
        persons.put(190265, "Илья");
        persons.put(377821, "Кирилл");
        persons.put(298261, "Лучезар");
        persons.put(659390, "Тимофей");
        for(Map.Entry<Integer,String> item:persons.entrySet())
        {
            System.out.println("Ключ: "+item.getKey()+" Значение: "+item.getValue());
        }

        //поиск по ключу
        System.out.println("\nПоиск по ключу:");
        System.out.println(persons.get(864997));
        System.out.println(persons.get(298261));
        System.out.println(persons.get(449870));
        System.out.println(persons.get(953710));

        //все ключи, которые имеются
        System.out.println("\nВсе ключи, которые имеются: ");
        System.out.println(persons.keySet());
        System.out.println(persons.values());

        //удаляем элемент по ключу
        System.out.println("\nУдаление элемента: ");
        System.out.println(persons.remove(298261));
        System.out.println(persons.remove(864997));
        System.out.println(persons.values());
    }
}