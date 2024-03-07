package com.itheima.test01;

public class Zi extends Fu{
    public int num = 20;
    public Zi()	{
        System.out.println("zi");
    }
    public void show() {
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
