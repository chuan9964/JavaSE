package com.itheima.thread02;

import java.util.concurrent.Callable;

public class MyCallable2 implements Callable<Integer> {

    private int num;
    public MyCallable2(int num){
        this.num = num;
    }
    @Override
    public Integer call() throws Exception {
        return Math.abs(num);
    }
}
