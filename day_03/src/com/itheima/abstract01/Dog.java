package com.itheima.abstract01;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public Dog() {
    }

    @Override
    public void cry() {
        System.out.println("小狗汪汪汪...");
    }
}
