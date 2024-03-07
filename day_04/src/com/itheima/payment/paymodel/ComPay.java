package com.itheima.payment.paymodel;

import com.itheima.payment.inter.Payment;

public class ComPay implements Payment {
    /**
     * 重写 Payment方法来使用指定支付方式支付
     * @param money 支付的钱数
     */
    @Override
    public void pay(double money) {
        System.out.println("通过支付平台支付了：" + money + "元！");
    }
}
