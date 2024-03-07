package com.itheima.thread;

import java.util.concurrent.Callable;

/*
   Callable接口有个泛型 表示 返回的结果类型。

      返回值 call
 */
public class MyCallable1 implements Callable<String> {


    //任务 求一个数的 绝对值
    @Override
    public String call() throws Exception {

        System.out.println("当前的线程:"+Thread.currentThread().getName());

        return "下载任务执行成功";//直接使用
    }


}
