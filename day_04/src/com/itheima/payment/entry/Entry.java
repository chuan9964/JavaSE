package com.itheima.payment.entry;

import com.itheima.payment.factory.PaymentFactory;
import com.itheima.payment.inter.Payment;

import java.util.Scanner;

public class Entry {

    public static void main(String[] args) {

        // 输出支付方式供用户进行选择
		System.out.println("请选择支付方式：1、支付平台支付  2、银行卡网银支付  3、信用卡快捷支付");
        Scanner sc = new Scanner(System.in) ;
        System.out.print("请输入您的支付方式：");
        String paymentType = sc.nextLine();

        // 补全代码: 通过工厂类获取支付接口的子类对象
        Payment payment = PaymentFactory.choose(paymentType);
        // 避免异常输入情况
        if (payment == null){
            System.out.println("该支付方式不存在！");
            return;
        }

        // 输入支付金额
        System.out.print("请输入您的支付金额：");
        double totalMoney = sc.nextDouble();

        // 补全代码：调用支付接口对象的方法完成支付
        payment.pay(totalMoney);

    }

}
