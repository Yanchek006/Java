package ru.mirea7_5;
import java.lang.String;

import java.util.Scanner;


public class OperationString implements ProcessStrings {

    public int count;
    public void CountSymb() {
        String str = new String("Hi welcome to Tutorialspoint");
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        System.out.println("а) Исходная строка: Hi welcome to Tutorialspoint");
        System.out.println("a) Подсчет символов в строке (including spaces): "+count);
    }


    public void Returner()
    {
        int length=0;
        System.out.println("б) Исходная строка: Lorem ipsumdolorsit");
        System.out.println("б) Строка, где символы размещены на нечетных позициях: ");
        String s= new String("Lorem ipsumdolorsit");
        length = s.length();
        char[] c = s.toCharArray();
        for (int i=0; i<length; i++) {
            if (i%2 == 0)
                System.out.print(c[length - i - 1]);
        }
    }


    public static String reverseString(String str,int index) {
        if(index == 0){
            return str.charAt(0) + "";
        }
        char letter = str.charAt(index);
        return letter + reverseString(str, index-1);
    }
    public void reverStr()
    {
        String str = "JavaRush forever";
        System.out.println("\nв) Исходная строка: JavaRush forever");
        System.out.println("в) Инвертирование строки: " + reverseString(str, str.length()-1));
    }

    public String toString() {
        return "";
    }

}
