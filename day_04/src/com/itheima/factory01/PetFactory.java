package com.itheima.factory01;

public class PetFactory {


    public static Animal getAnimal(int choose) {
        switch (choose) {
            case 1:
                return new Cat();
            case 2:
                return new Dog();
            case 3:
                return new Pig();
            default:
                return null;
        }
    }
}
