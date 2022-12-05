package ru.task_5_2;
import java.util.Scanner;
public class Number_5_2 {
    public static String OddCounter() //Добавляет в набор счетчиков счетчик с указанным идентификатором и типом.
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s="";
        if (a!=0)
            s += OddCounter();
        if (a%2!=0)
            s += Integer.toString(a);
        // это встроенный метод в Java, который используется для возврата строкового объекта,
        // представляющего значение этого целого числа.
        //Возвращаемое значение: метод возвращает объект string с определенным целочисленным значением.
        return s;
    }

    public static void toGet()
    {
        int length=0; //Длина подстроки в данном экземпляре.
        String s="";
        s=OddCounter();
        length = s.length();
        char[] c = s.toCharArray(); //Копирует знаки данного экземпляра в массив знаков Юникода.
        for (int i=0; i<length; i++)
            System.out.println(c[length-i-1]);
    }
    public static void main(String[] args)
    {
        toGet();
    }
}