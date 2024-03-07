package com.itheima.duotai03;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog(2, "黑色");
        Animal cat = new Cat(3, "灰色");

        Person wang = new Person("老王", 30);
        wang.keepPet(dog, "骨头");
        Person li = new Person("老李", 25);
        li.keepPet(cat, "鱼");
    }
}