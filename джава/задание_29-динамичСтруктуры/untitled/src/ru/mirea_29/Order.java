package ru.mirea_29;

public interface Order {
    boolean addPosition(Item item);
    int count();
    boolean remove(String dishName);
    void deleteAll(String name);
    int costAll();
    int orderName(String p);
    String[] getDishes();
}