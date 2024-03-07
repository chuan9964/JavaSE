package com.itheima.factory01;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        int choose = sr.nextInt();
        Animal animal = PetFactory.getAnimal(choose);
        animal.call();

    }
}
