package com.itheima.thread02;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Test03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        FutureTask futureTask = new FutureTask(myCallable);
        new Thread(futureTask).start();

        System.out.println(futureTask.get());

        MyCallable2 myCallable2 = new MyCallable2(-12);
        FutureTask<Integer> futureTask2 = new FutureTask<Integer>(myCallable2);
        new Thread(futureTask2).start();

        System.out.println(futureTask2.get());

    }
}
