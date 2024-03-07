package com.itheima.static01;

public class Test {
    public static void main(String[] args) {
       //静态变量 推荐通过类名调用
        Student.teacherName = "刘伟传老师";

        //创建一个学生对象
        Student s1 = new Student();
        s1.name = "努力的迪迪";
//        Student.name = "错误的";
        s1.age = 20;
//        s1.teacherName = "石破天老师";
        s1.study();

        //创建一个对象
        Student s2 = new Student();

        s2.study();
    }
}
