package com.itheima.code02;

public class Test {

    public static void main(String[] args) {
        Coder coder = new Coder("刘伟传", "1001", 18000);
        coder.work();

        Manager manager = new Manager("张三", "1002", 10000, 10000);
        manager.work();

    }
}
