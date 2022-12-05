package ru.mirea_18_4;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo()
    {
        String intString = "";
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Ошибка! Попробуйте еще раз...");
        }
        finally {
            System.out.printf("Введённые данные: %s",intString);
        }
    }
}