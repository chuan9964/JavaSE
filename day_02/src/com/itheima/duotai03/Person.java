package com.itheima.duotai03;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public void keepPet(Dog dog, String something) {
//        System.out.println("年龄为"+getAge()+"岁的"+getName()+"养了一只"+dog.getColor()+"的"+dog.getAge()+"岁的狗");
//        dog.eat(something);
//    }
//
//    public void keepPet(Cat cat, String something) {
//        System.out.println("年龄为"+getAge()+"岁的"+getName()+"养了一只"+cat.getColor()+"的"+cat.getAge()+"岁的猫");
//        cat.eat(something);
//    }

    public void keepPet(Animal animal, String something){
        System.out.println("年龄为"+getAge()+"岁的"+getName()+"养了一只"+animal.getColor()+"的"+animal.getAge()+"岁的宠物");
        animal.eat(something);
        if (animal instanceof Dog dog){
            dog.lookHome();
        }

        if (animal instanceof Cat cat){
            cat.catchMouse();
        }
    }
}
