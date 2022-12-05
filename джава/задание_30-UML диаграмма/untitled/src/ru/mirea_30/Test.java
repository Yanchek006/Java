package ru.mirea_30;

public class Test {
    public static void main(String[] args) {
        int a;
        String b;
        char c;
        boolean d;
        double e;

        /////////////////////
        Address adr = new Address();
        Address adr1 = new Address(" Lenina", 42, 'b', 145);
        Address adr2 = new Address(" Moscow ",1119923, "Arbat ", 68, 'a', 50);
        a=adr1.getApartmentNumber();
        a=adr1.getBuildingNumber();
        b=adr1.getCityName();
        b=adr1.getStreetName();
        a=adr1.getZipCode();
        c=adr1.getBuildingLetter();
        b=adr2.toString();
        d=adr1.equals(adr2);
        a=adr1.hashCode();


        /////////////////////

        Customer cst = new Customer();
        Customer cst1 = new Customer(35);
        Customer cst2 = new Customer("Calidarh ","Miratov ",35,adr2);
        b=cst1.getFirstName();
        b=cst1.getSecondName();
        a=cst1.getAge();
        adr=cst1.getAddress();
        b=cst2.toString();
        d=cst.equals(cst2);
        a=cst2.hashCode();
        System.out.println(cst2);

        /////////////////////

        Dish dsh = new Dish(390, " Salad - ", " good dish ");
        Dish dsh1 = new Dish(" Ice cream,", " Chocolate");
        b=dsh1.getName();
        b=dsh.getName();
        a=dsh.getPrice();
        b=dsh.toString();
        d=dsh.equals(dsh1);
        a=dsh1.hashCode();
        System.out.println(b);
        System.out.println(dsh1);

        /////////////////////

        Drink drn = new Drink("White",DrinkTypeEnum.VODKA);
        Drink drn1 = new Drink(1234, " - Martini ", "good product", DrinkTypeEnum.WATER );
        Drink drn2 = new Drink(432, " - Super Wine - ", "red", 12.4,DrinkTypeEnum.WINE);
        b=drn1.getName();
        b=drn1.getDescription();
        a=drn2.getPrice();
        e=drn2.getAlcoholVol();
        System.out.println(drn1);
        System.out.println(drn2);
        drn.getType();
        d=drn.equals(drn2);
        a=drn2.hashCode();
        d=drn2.isAlcoholicDrink();
        b=drn1.toString();

        /////////////////////

        MenuItem f[]= new MenuItem[3];
        f[0]=drn;
        f[1]=dsh;
        InternetOrder ntnrdr = new InternetOrder(cst,f);
        ntnrdr.itemQuantity(f[1]);
        f[2]=drn2;
        ntnrdr.add(drn2);
        ntnrdr.getItems();
        ntnrdr.getCustomer();
        ntnrdr.itemQuantity("Vodka");
        ntnrdr.hashCode();
        ntnrdr.sortedItemsByCostDesc();
        ntnrdr.get(1);
        ntnrdr.remove(f[1]);

        /////////////////////

        MenuItem j[]= new MenuItem[2];
        j[0]=drn;
        j[1]=dsh;
        TableOrder tblrdr = new TableOrder(cst);
        TableOrder tblrdr1 = new TableOrder(2,cst);
        TableOrder tblrdr2 = new TableOrder(j,cst2);
        tblrdr.itemQuantity("Vodka");
        tblrdr.itemQuantity(j[1]);
        f[2]=drn2;
        tblrdr2.add(drn2);
        tblrdr.getItems();
        tblrdr.getCustomer();
        tblrdr2.hashCode();
        tblrdr2.get(1);
        tblrdr.remove(j[1]);
        tblrdr2.sortedItemsByCostDesc();

        /////////////////////

        InternetOrdersManager in1 = new InternetOrdersManager();
        InternetOrdersManager in2 = new InternetOrdersManager(4);

        System.out.println(in2);
        /////////////////////

        TableOrdersManager tb1 = new TableOrdersManager(5);

        /////////////////////
    }
}