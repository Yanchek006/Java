package ru.mirea81;

import java.util.Scanner;

public class Number12
{

    public static String OddCounter()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s="  ";
        if (a!=0)
            s += OddCounter();
        if (a%2!=0)
            s += Integer.toString(a);
        return s;
    }

    public static void toGet()
    {
        int length=0;
        String s="";
        s=OddCounter();
        length = s.length();
        char[] c = s.toCharArray();
        for (int i=0; i<length; i++)
            System.out.println(c[length-i-1]);
    }

    public static void main(String[] args)
    {
        toGet();
    }
}