package ru.task5_1;

import java.util.Scanner;
//Он, словно настоящий сканер, считывает данные из источника, который ты для него укажешь. Например, из строки,
// из файла, из консоли. Далее он распознает эту информацию и обрабатывает нужным образом.

    public class Number_5_1
    {
        public static void main(String[] args)
        {
            System.out.println(theCounter());
        }

        public static int theCounter()
        {
            //этот код позволяет пользователю считывать число изSystem.in:
            Scanner sc = new Scanner (System.in);
            int n=0;
            //Метод nextInt() считывает и возвращает введенное число.
            // В нашей программе он используется для того, чтобы присвоить значение переменной
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