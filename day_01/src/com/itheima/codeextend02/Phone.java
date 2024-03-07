package com.itheima.codeextend02;

public class Phone {
    private String brand;
    private double price;

    static int size;

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Phone() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                "size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    public void call(){
        System.out.println("打电话...");
    }
    public void sendMessage(){
        System.out.println("发短信...");
    }
    public void playGame(){
        System.out.println("玩游戏...");
    }

}
