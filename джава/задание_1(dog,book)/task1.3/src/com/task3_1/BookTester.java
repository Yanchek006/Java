package com.task3_1;

public class BookTester {
    public static void main(String[] args) {
        Book book = new Book("Bill of anarchy", 578);
        Book book2 = new Book("Bill of anarchy 2", 711);
        System.out.println(book);
        System.out.println(book2);
        book2.setName("Bill of anarchy, come to anarchy");
        book2.setNameOfPages(822);
        System.out.println(book2);
    }
}