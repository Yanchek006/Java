package ru.mirea_17_3;

public class App {
    public static void main(String[] args) {
        // Assemble all the pieces of the MVC
        Model m = new Model("Зевс", "Олимпович");
        View v = new View("MVC java");
        Controller c = new Controller(m, v);
        c.initController();
    }
}