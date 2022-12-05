package ru.mirea_26_4;

import java.util.*;

class Queue {
    // Main Method
    public static void main(String args[]) {
       //создать очередь с приоритетом из 10 элементов
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(30);
        pQueue.add(40);
        pQueue.add(50);
        pQueue.add(60);
        pQueue.add(70);
        pQueue.add(80);
        pQueue.add(90);
        pQueue.add(100);
        System.out.println(pQueue);

        pQueue.remove(100);
        pQueue.remove(90);
        pQueue.remove(20);
        pQueue.remove(60);
        System.out.println(pQueue);
    }
}