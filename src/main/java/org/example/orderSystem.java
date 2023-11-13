package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class orderSystem {
    private Map<Integer, Menu> orderSys = new HashMap<>();
    Set<Integer> keySet = orderSys.keySet();
    public void addMenu(Menu menu){
       orderSys.put(orderSys.size()+1,menu);
    }
    public void getOrderById(int num){
        System.out.println(orderSys.get(num));
    }
    public void placeOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a order number!");
        int orderId = scanner.nextInt();
        //getOrderById(orderId);


        //System.out.println(keySet);
        if(keySet.contains(orderId)){
            getOrderById(orderId);
        } else {
            System.out.println("Sorry we don't have this in our menu.");
        }
    }
    public void start(){
        for (int key:keySet) {
            Menu menu = orderSys.get(key);
            System.out.println("Menu number:"+key+" name:"+menu.getName()+" price:"+menu.getPrice()
            +" main dish:"+menu.getMainDish()+" side dish:"+menu.getSideDish()+" beverage:"+menu.getBeverage());
        }
    }
    @Override
    public String toString() {
        return "orderSystem{" +
                "orderSys=" + orderSys +
                '}';
    }
}
