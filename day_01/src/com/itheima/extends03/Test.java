package com.itheima.extends03;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("1001", "刘伟传", 18000.0, 30000);
        manager.eat();
        manager.work();
        System.out.println(manager.toString());


        Cooker cooker = new Cooker("1002", "张三", 10000);
        cooker.eat();
        cooker.work();
        System.out.println(cooker.toString());

    }
}
