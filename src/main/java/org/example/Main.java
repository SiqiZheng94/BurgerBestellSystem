package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Menu menu1 = new Menu("A",20.50F, "A", "a","aa");
        Menu menu2 = new Menu("B",9.85F, "B", "b","bb");
        orderSystem orderSys = new orderSystem();
        System.out.println("===add order===");
        orderSys.addMenu(menu1);
        orderSys.addMenu(menu2);
        System.out.println(orderSys);
        System.out.println("===System is up===");
        orderSys.start();
        System.out.println("===order by id===");
        orderSys.getOrderById(1);
        orderSys.getOrderById(2);
        System.out.println("===place order===");
        orderSys.placeOrder();
    }
}