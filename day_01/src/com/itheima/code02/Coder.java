package com.itheima.code02;

public class Coder extends Employee{

    public Coder() {
    }

    public Coder(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("程序员在工作...");
    }

}
