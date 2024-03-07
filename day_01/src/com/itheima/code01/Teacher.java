package com.itheima.code01;

public class Teacher extends Role {
    private String deptName;

    public Teacher() {
    }

    public Teacher(String name, int age, String deptName) {
        super(name, age);
        this.deptName = deptName;
    }

    public String getdeptName() {
        return deptName;
    }

    public void setdeptName(String deptName) {
        this.deptName = deptName;
    }

    public void publishForm() {
        System.out.println("发布问题...");
    }
}
