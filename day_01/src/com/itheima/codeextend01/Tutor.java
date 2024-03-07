package com.itheima.codeextend01;

public class Tutor extends Teacher{
    public Tutor(String id, String name) {
        super(id, name);
    }

    public Tutor() {
    }

    @Override
    public void work() {
        System.out.println("助教正在工作...");
    }
}
