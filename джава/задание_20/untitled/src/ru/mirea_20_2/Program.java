package ru.mirea_20_2;

public class Program{

    public static void main(String[] args) {

        Account acc1 = new Account("Account");
        Accounts acc2 = new Accounts("Accounts");
        Accountss acc3 = new Accountss("Accountss");
        System.out.println(acc1.getName());
        System.out.println(acc2.getName());
        System.out.println(acc3.getName());
    }
}

class Account {
    private String name;

    <T> Account(T name) {
        this.name = name.toString();
    }

    public String getName() {
        return name;
    }
}
class Accounts {
    private String name;

    <V> Accounts(V name) {
        this.name = name.toString();
    }

    public String getName() {
        return name;
    }
}
class Accountss {
    private String name;

    <K> Accountss(K name) {
        this.name = name.toString();
    }

    public String getName() {
        return name;
    }
}
