package com.itheima.codeextend04;

public class Cat extends Animal{
    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat() {
    }

    @Override
    public void eat(String something) {
        System.out.println("颜色为"+getColor()+"的"+getAge()+"岁的猫，在吃"+something);
    }

    public void catchMouse(){
        System.out.println("抓老鼠...");
    }
}
