package ru.mirea7_8;

public class Book
{
    String nameOfBook;

    public Book ( String nameOfBook)
    {
        this.nameOfBook = nameOfBook;
    }

    public String getNameOfBook()
    {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook)
    {
        this.nameOfBook = nameOfBook;
    }


    public String toString() {
        return "nameOfBook = " + nameOfBook + ' ';
    }
}