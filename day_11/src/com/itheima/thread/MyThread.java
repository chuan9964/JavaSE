package com.itheima.thread;

public class MyThread extends Thread{

    @Override
    public void run() {
        /*
          每个新的线程 都循环输出 十次
         */
        for (int i = 0; i < 100; i++) {
           // 代码执行过程中 可以获取到当前正在运行的线程对象
            Thread thread = Thread.currentThread();
            System.out.println("新的线程"+thread.getName()+"正在执行"+print(i));
        }
    }
    public  static  String print(int i){
        StringBuilder sb = new StringBuilder();
        for (int p = 0; p < i; p++) {
            sb.append("*");
        }
        return new String(sb);
    }
}
