package com.itheima.equals01;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {
        super();//ctrl+左键
    }


    public Student(String name, int age) {
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
    // alt+insert 选择 toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {//Object 接收
        if (this == o) // 判断两个对象 是不是一个地址
            return true;
        if (o == null || getClass() != o.getClass())
            // 另外一个对象是null 或者 两者类型不一样 没有必要判断 返回false
            return false;
        // 向下转型 目的 进行属性的比较
        Student student = (Student) o;
        //   基本类型属性比较了    引用类型比较
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
