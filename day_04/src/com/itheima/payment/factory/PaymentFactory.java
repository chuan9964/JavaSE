package com.itheima.payment.factory;

import com.itheima.payment.inter.Payment;
import com.itheima.payment.paymodel.CardPay;
import com.itheima.payment.paymodel.ComPay;
import com.itheima.payment.paymodel.FastPay;


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
