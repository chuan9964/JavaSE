package com.itheima.extends03;

public class Cooker extends Employee {
    public Cooker() {
    }

    public Cooker(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("炒菜...");
    }
}
