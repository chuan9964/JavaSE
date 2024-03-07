package com.itheima.a_lambda;

public class CompareByData {

    public static int compareByAge(Person o1,Person o2){

        return o1.getAge()-o2.getAge();
    }

    public  int compareByAgeDesc(Person o1,Person o2){

        return o2.getAge()-o1.getAge();
    }
}
