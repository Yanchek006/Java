package ru.mirea83;


import java.util.Scanner;

public class Numer13
{
    public static String OddCounter()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s="";
        if (a!=0)
            s += OddCounter();
        else
            return s;
        s += Integer.toString(a);
        return s;
    }

    public static void Returner()
    {
        int length=0;
        String s="";
        s=OddCounter();
        length = s.length();
        char[] c = s.toCharArray();
        for (int i=0; i<length; i++) {
            if (i%2 == 0)
                System.out.println(c[length - i - 1]);
        }
    }

    public static void main(String[] args)
    {
        Returner();
    }
}