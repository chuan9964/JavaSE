package com.itheima.thread02;

public class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"正在运行："+i);
        }
    }
}
