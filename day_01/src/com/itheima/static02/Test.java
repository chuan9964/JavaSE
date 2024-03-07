package com.itheima.static02;

public class Test {
    public static void main(String[] args) {
        new User();
        new User();
        new User();
        new User();
        new User();

        int count = User.count;
        System.out.println(count);
    }

}
