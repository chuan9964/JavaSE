package com.itheima.thread02;

public class ThreadTest01 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"正在运行："+i);
        }
    }
}
