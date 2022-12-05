package ru.mirea_29;

public class Order_ex extends Exception{
    public Order_ex(int ex){
        super("Order is already added at " + ex + " table");
    }
}