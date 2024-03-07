package com.itheima.duotai03;

public class Cat extends Animal {
    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat() {
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "的猫咪眯着眼睛侧着头吃" + something);
    }

    public void catchMouse() {
        System.out.println("抓老鼠...");
    }
}
