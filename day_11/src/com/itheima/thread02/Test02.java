package com.itheima.thread02;

public class Test02 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);

        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"正在运行："+i);
        }


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();


    }
}
