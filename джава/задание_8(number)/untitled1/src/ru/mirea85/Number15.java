package ru.mirea85;

import java.util.Scanner;

public class Number15 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n;
        n= sc.nextInt();
        NumberCount(n);
    }

    public static void NumberCount(long n)
    {
        int x;
        if (n%10!=0) {
            x =(int)(n % 10);
            n = n/10;
        }
        else
            return ;
        System.out.println(x);
        NumberCount(n);
    }
}