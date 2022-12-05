package ru.mirea_20_1;
//T (тип) представляет определенный тип Java
//K V (значение ключа) соответственно представляет значение ключа в значении ключа Java
public class Program{

    public static void main(String[] args) {

        Account<String, Double, String> acc1 = new Account<String, Double, String>("354", 5000.87, "Люцифер");
        String id = acc1.getId();
        Double sum = acc1.getSum();
        String name = acc1.getName();
        System.out.printf("Id: %s\nSum: %s\nName: %s\n", id, sum, name);
    }
}
class Account<T, S, V>{

    private T id;
    private S sum;
    private V name;

    Account(T id, S sum, V name){
        this.id = id;
        this.sum = sum;
        this.name = name;
    }

    public T getId() { return id; }
    public S getSum() { return sum; }
    public V getName() { return name; }
}