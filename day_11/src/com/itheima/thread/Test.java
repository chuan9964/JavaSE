package com.itheima.thread;

public class Test {

    public static void main(String[] args) {
        System.out.println("当前是一个程序的入口"+Thread.currentThread().getName());
        System.out.println("程序入口也是一个线程 这个线程叫主线程..");

        //主线程执行过程中 再产生新的线程。
        /*
          线程的创建方式一
              1: 创建一个类 继承 Thread线程类
              2: 手动重写run方法。----就是新的线程对象要执行的内容.
              3: 创建 子类对象(线程对象)。
              4: 调用start方法 开启这个新的线程。
              当开启完了 程序中出现两个线程了 一个是 主线程  一个新建的线程。
              每个线程将来都是独立的空间。
         */
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("线程"+Thread.currentThread().get/Name()+"正在执行"+i);
//        }
        for (int i = 0; i < 10; i++) {
            new MyThread().start();
        }
    }
}
