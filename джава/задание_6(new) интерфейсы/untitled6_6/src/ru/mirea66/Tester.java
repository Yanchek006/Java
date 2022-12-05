package ru.mirea66;


public class Tester {
    public static void main(String[] args) {
        Printable[] printables = new Printable[6];
        printables[0] = new Book();
        printables[1] = new Shop();
        printables[2] = new Book();
        printables[3] = new Shop();
        printables[4] = new Book();
        printables[5] = new Shop();

        for (Printable printable : printables) {
            printable.print();
        }
    }
}