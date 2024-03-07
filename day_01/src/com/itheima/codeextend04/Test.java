package com.itheima.codeextend04;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat(2, "黑色");
        Dog dog = new Dog(1, "花色");

        Person person = new Person();
        person.keepPet(cat, "小鱼干");
        person.keepPet(dog, "骨头");
    }
}
