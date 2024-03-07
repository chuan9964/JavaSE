package com.itheima.set02;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private double height;


    public Student() {
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     *
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", height = " + height + "}";
    }

    //利用idea快捷键  hashCode equals

    /*
      比较两个对象的内容
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.height, height) == 0 && Objects.equals(name, student.name);
    }

    /*
     根据属性算哈希值  尽量不一样的属性 值不同 减少哈希碰撞
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }
}
