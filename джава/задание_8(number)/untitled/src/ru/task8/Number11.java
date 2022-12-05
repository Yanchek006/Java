package ru.task8;

import java.util.Scanner;

public class Number11
{
    public static void main(String[] args)
    {
        System.out.println(theCounter());
    }

    public static int theCounter()
    {
        Scanner sc = new Scanner (System.in);
        int n=0;
        int x = sc.nextInt();
        if (x == 00)
            return 0;
        n=n+theCounter();
        if (x == 1)
        {
            n++;
        }
        return n;
    }
}