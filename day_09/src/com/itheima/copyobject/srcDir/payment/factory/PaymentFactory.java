package com.itheima.copyobject.srcDir.payment.factory;

import com.itheima.copyobject.srcDir.payment.paymodel.ComPay;
import com.itheima.copyobject.srcDir.payment.paymodel.FastPay;
import com.itheima.copyobject.srcDir.payment.inter.Payment;
import com.itheima.copyobject.srcDir.payment.paymodel.CardPay;


public class PaymentFactory {       // 支付接口工厂类

public static Payment choose(String paymentType){

    // 使用字符串当作switch的参数
    return switch (paymentType) {
        case "1" ->
                // 支付平台支付
                new ComPay();
        case "2" ->
                // 银行卡网银支付
                new CardPay();
        case "3" ->
                // 信用卡快捷支付
                new FastPay();
        default -> null;
    };
}

}
