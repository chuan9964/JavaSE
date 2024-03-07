package com.itheima.code01;

public class Student extends Role{
    private String className;

    public Student() {
    }

    public Student(String name, int age, String className) {
        super(name, age);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void fillForm(){
        System.out.println("填写听课反馈...");
    }
}
