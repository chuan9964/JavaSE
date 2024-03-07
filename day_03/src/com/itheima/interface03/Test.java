package com.itheima.interface03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("小兔子", 2);
        rabbit.eat();

        Dog dog = new Dog("小狗子", 2);
        dog.eat();
        dog.swimming();

        Frog frog = new Frog("小蛙子", 2);
        frog.eat();
        frog.swimming();

    }
}
