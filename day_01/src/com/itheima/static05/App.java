package com.itheima.static05;

public class App {

    //静态初始化一个对象
    private static App app = new App();

    //隐藏构造方法
    private App(){}

    //获取
    public static App getApp(){
        return app;
    }
}
