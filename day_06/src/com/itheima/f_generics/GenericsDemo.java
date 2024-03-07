package com.itheima.f_generics;

public class GenericsDemo {

    public static void main(String[] args) {
        String aaa = test("aaa");

        Integer test = test(12);

        Double test1 = test(1.23);
    }

    public static <T> T test(T t){

        return t;
    }
}
