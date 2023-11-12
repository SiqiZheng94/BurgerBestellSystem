package org.example;

public class Menu {
    private String name;
    private float price;
    private String mainDish;
    private String sideDish;
    private String beverage;

    public Menu(String name, float price, String mainDish, String sideDish, String beverage) {
        this.name = name;
        this.price = price;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.beverage = beverage;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getMainDish() {
        return mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public String getBeverage() {
        return beverage;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", mainDish='" + mainDish + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", beverage='" + beverage + '\'' +
                '}';
    }
}
