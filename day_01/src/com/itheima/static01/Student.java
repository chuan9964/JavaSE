package com.itheima.static01;

public class Student {
    String name;
    int age;
    static String teacherName;

    public void study(){
        System.out.println(name+"正在"+teacherName+"指导下学习。");
    }
}
