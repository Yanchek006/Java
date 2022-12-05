package ru.mirea7_8;

public class TesterBook {
    public static void main(String[] args) {
        Book Witcher = new Book( "Witcher");
        Witcher.setNameOfBook("Witcher");
        System.out.println(Witcher);
        System.out.println(Witcher instanceof Book);

        Book Portrait_of_Dorian_Gray = new Book( "Portrait_of_Dorian_Gray");
        Portrait_of_Dorian_Gray.setNameOfBook("Portrait_of_Dorian_Gray");
        System.out.println(Portrait_of_Dorian_Gray);
        System.out.println(Portrait_of_Dorian_Gray instanceof Book);

        Book Pride_and_Prejudice = new Book( "Pride_and_Prejudice");
        Pride_and_Prejudice.setNameOfBook("Pride_and_Prejudice");
        System.out.println(Pride_and_Prejudice);
        System.out.println(Pride_and_Prejudice instanceof Book);
    }
}