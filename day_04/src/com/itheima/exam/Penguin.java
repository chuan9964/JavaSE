package com.itheima.exam;

public class Penguin{
    //下面蓝色的部分被称为 属性 , 字段 , 成员变量
    private String name=null; // 名字
    private int health=0; // 健康值
    private String sex=null; // 性别
    public void Penguin() { // 构造方法没有void,所以这是个普通的方法
        health = 10;
        sex = "雄";
        System.out.println("执行构造方法。");
    }
    public void print(){
        System.out.println("企鹅的名字是" + name +"，健康值是" + health + "，性别是" + sex+
                "。");
    }
    public static void main(String[] args) {
        Penguin pgn = new Penguin();
        pgn.print();
    }
}

