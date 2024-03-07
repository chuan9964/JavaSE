package com.itheima.thread02;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {

    @Override
    public Object call() throws Exception {
        return "哈哈哈哈啊哈";
    }
}
