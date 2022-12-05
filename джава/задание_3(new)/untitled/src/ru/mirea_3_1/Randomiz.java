package ru.mirea_3_1;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class Randomiz {
    public static void main(String[] args) {
        int N = 1;
        int K = 10;
        double[][] m = new double[N][K];
        double a = 1.5;
        double b = 3.7;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                m[i][j] = Math.round(ThreadLocalRandom.current().nextDouble(a, b) * 10) / 10.0;
            }
        }
        System.out.println("Массив веществнных чисел через метод Ramdom: ");
        for (int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
        System.out.println("Отсортированный массив веществнных чисел через метод Ramdom: ");


    }
}

