package com.itheima.payment.inter;
@FunctionalInterface
public interface Payment {                              // 定义支付接口


    public abstract void pay(double money) ;            // 支付方法

}
