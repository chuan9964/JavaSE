package com.itheima.copyobject.srcDir.payment.paymodel;

import com.itheima.copyobject.srcDir.payment.inter.Payment;

public class FastPay implements Payment {
    /**
     * 重写 Payment方法来使用指定支付方式支付
     * @param money 支付的钱数
     */
    @Override
    public void pay(double money) {
        System.out.println("通过信用卡快捷支付了：" + money + "元！");
    }
}
