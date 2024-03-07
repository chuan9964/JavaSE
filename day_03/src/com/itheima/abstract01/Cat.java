package com.itheima.abstract01;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("小猫喵喵喵...");
    }
}
