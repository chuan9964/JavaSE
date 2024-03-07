package com.itheima.codeextend01;

public class Lecturer extends Teacher{
    public Lecturer(String id, String name) {
        super(id, name);
    }

    public Lecturer() {
    }

    @Override
    public void work() {
        System.out.println("讲师正在工作...");
    }
}
