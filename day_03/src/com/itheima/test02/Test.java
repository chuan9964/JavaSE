package com.itheima.test02;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Cat("小猫", 2);
        animal1.run();
        animal1.eat();

        Animal animal2 = new Dog("小狗", 1);
        animal2.run();
        animal2.eat();
    }
}
