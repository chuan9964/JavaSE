package com.itheima.extends02;

public class Test {

    public static void main(String[] args) {
        //创建一个 子类对象
        Teacher t = new Teacher();
        //设置名字
        t.setName("刘伟传");//父亲
        t.setSkill("讲Java");//自己
        //获取
        String name = t.getName();
        String skill = t.getSkill();
        System.out.println(name+"会"+skill);
    }
    // 父类的字节码先进入内存  子类。
    // 子类对象new的空间里面 会先完成父类变量初始化，再完成自己的。
}
