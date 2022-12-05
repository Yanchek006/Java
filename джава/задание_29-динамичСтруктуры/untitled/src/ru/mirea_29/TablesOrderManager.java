package ru.mirea_29;


import java.util.HashMap;

public class TablesOrderManager {
    HashMap<Integer, Object> orderHashMap = new HashMap<Integer, Object>();
    HashMap<String, Object> orderHashMap1 = new HashMap<String, Object>();

    public void add(Order o, int table) throws Order_ex {
        String str = String.join(",", o.getDishes());
        if (orderHashMap.containsKey(table))
            throw new Order_ex(table);
        else orderHashMap.put(table, str);
    }
    public Object getOrder(int table){
        return orderHashMap.get(table);
    }
    public void add(Dish dish, int table) throws Order_ex {
        if (orderHashMap.containsKey(table))
            throw new Order_ex(table);
        else orderHashMap.put(table, dish);
    }
    public void removeOrder(int table){
        orderHashMap.remove(table);
    }
    public HashMap orders(){
        return orderHashMap;
    }

    public void add(Order o, String address) {
        String str = String.join(",", o.getDishes());
        orderHashMap1.put(address, str);
    }
    public Object getOrder(String address){
        return orderHashMap1.get(address);
    }
    public void removeOrderInternet(String address){
        orderHashMap1.remove(address);
    }
    public HashMap getInternetOrder(){
        return orderHashMap1;
    }
}