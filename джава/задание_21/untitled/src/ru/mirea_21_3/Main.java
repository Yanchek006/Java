package ru.mirea_21_3;


public class Main {

    public static void main(String[] args) {
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        UniArray<Integer> array = new UniArray(numbers);

        for (int i = 0; i < numbers.length; i++) {
            array.setElement(array.getElement(i) * 39, i);
            System.out.print(array.getElement(i) + " ");
        }
        System.out.println();
    }
}