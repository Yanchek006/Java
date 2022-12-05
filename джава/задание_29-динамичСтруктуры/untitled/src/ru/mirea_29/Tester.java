package ru.mirea_29;

import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) throws Order_ex {
        ArrayList<String> dish = new ArrayList<>();
        dish.add( "Salad: Fruit Mix: 530");
        dish.add("Salad: Caesar: 490");
        dish.add("Soup: Vegetable: 380");
        dish.add("Greek salad: Vegetables: 320");
        dish.add("Alcoholic drink: Rum: 590");
        dish.add("Alcoholic drink: Martini:  460");
        dish.add("Juice: Orange, Apple, Multi: 190");
        System.out.println("Menu: ");
        for (String s: dish)
            System.out.println(s);

        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.addPosition(new Dish("Soup", "Vegetable", 380));
        restaurantOrder.addPosition(new Drink("Juice", "Orange", 190));
        System.out.println("\nPositions in the order: " + restaurantOrder.count());
        System.out.println(Arrays.toString(restaurantOrder.getDishes()));

        RestaurantOrder restaurantOrder1 = new RestaurantOrder();
        restaurantOrder1.addPosition(new Drink("Alcoholic drink", "Rum", 590));
        restaurantOrder1.addPosition(new Dish("Salad", "Fruit Mix", 530));
        restaurantOrder1.addPosition(new Drink("Alcoholic drink", "Martini", 460));
        restaurantOrder1.addPosition(new Dish("Greek salad", "Vegetables", 320));
        System.out.println("Positions in the order: " + restaurantOrder1.count());
        System.out.println(Arrays.toString(restaurantOrder1.getDishes()));

        System.out.println("\n" + "Restaurant orders: ");
        TablesOrderManager orderManager = new TablesOrderManager();
        orderManager.add(restaurantOrder, 1);
        orderManager.add(restaurantOrder1, 2);
        System.out.println(orderManager.orders());

        InternetOrder internetOrder = new InternetOrder();
        internetOrder.addPosition(new Dish("Salad", "Fruit Mix", 530));
        internetOrder.addPosition(new Dish("Salad", "Caesar", 490));
        internetOrder.addPosition(new Dish("Greek salad", "Vegetables", 320));
        System.out.println("\n" + "Internet orders: ");
        orderManager.add(internetOrder, "Moscow");
        System.out.println(orderManager.getInternetOrder());

    }
}