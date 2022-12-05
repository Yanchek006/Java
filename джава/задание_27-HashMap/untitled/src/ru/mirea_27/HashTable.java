package ru.mirea_27;
import java.util.*;

class HashTable {
    public static void main(String args[])
    {
        Hashtable<Double,Integer>
                ht = new Hashtable<Double,Integer>();

        ht.put(123.22, 432);
        ht.put(12.01, 2345);
        ht.put(15.2201, 5643);
        ht.put(322.91, 321);
        System.out.println(ht);

        ht.remove(12.01);
        System.out.println(ht);
    }
}