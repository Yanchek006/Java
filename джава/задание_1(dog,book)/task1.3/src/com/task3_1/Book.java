package com.task3_1;
public class Book
{
    String name;
    int nameOfPages;
    public Book(String name, int nameOfPages)
    {
        this.name = name; //this требуется для того, чтобы метод мог сослаться на вызвавший его объект
        this.nameOfPages = nameOfPages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameOfPages(int nameOfPages) {
        this.nameOfPages = nameOfPages;
    }

    public String getName() {
        return name;
    }

    public int getNameOfPages() {
        return nameOfPages;
    }

    public String toString() {
        return "book name=" + name + ", nameOfPages=" + nameOfPages;
    }
}