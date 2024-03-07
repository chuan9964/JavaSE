package com.itheima.equals01;

public class Test {


    public static void main(String[] args) {
        Student student1 = new Student("111",20);
        Student student2 = new Student("111",20);
        Student student3 = new Student("222",20);

        System.out.println(student1.equals(student2));
    }
}
