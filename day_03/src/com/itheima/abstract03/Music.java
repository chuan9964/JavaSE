package com.itheima.abstract03;

public abstract class Music {
    public final void play(){
        System.out.println("前奏音乐...");

        sing();

        System.out.println("末尾音乐...");
    }

    public abstract void sing();
}
