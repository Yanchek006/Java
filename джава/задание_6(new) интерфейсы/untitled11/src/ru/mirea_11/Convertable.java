package ru.mirea_11;

public class Convertable {
    public static void main(String[] args) {
        Celsius celsius = new Celsius(-40);

        System.out.println("Перевод температуры по Цельсию в температуру по Фаренгейту: ");
        System.out.println(celsius.convert(new Fahrenheit()));

        System.out.println("Перевод температуры по Цельсию в температуру по Кельвину: ");
        System.out.println(celsius.convert(new Kelvin()));


        Fahrenheit fahrenheit = new Fahrenheit(50);

        try {
            System.out.println("Перевод температуры по Фаренгейту в температуру по Цельсию: ");
            System.out.println(fahrenheit.convert(new Celsius()));
        } catch (AbsoluteZeroException e) {
            System.out.println(e.getMessage());
        }

        Kelvin kelvin = new Kelvin(303);

        try {
            System.out.println("Перевод температуры по Кельвину в температуру по Цельсию: ");
            System.out.println(kelvin.convert(new Celsius()));
        } catch (AbsoluteZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
