package com.itheima.test05;

import java.math.BigDecimal;
import java.util.Scanner;

public class WeiXin {
    public static void main(String[] args) {
        // 1.定义Scanner对象,输入要转账的金额,因为用BigDecimal需要传递String,所以我们调用next方法录入
        Scanner sr = new Scanner(System.in);
        // 2.调用转换金额的方法,参数传递我们录入的金额
        String next = sr.next();
        // 3.定义转换金额的方法,参数为String类型
        BigDecimal bigDecimal = new BigDecimal(next);
        // 4.创建两个BigDecimal对象,一个传递转账的金额,一个传递字符串的100
        BigDecimal num = BigDecimal.valueOf(100);
        // 5.调用BigDecimal对象的multiply乘以100,将元转成分
        bigDecimal = bigDecimal.multiply(num);
        // 6.调用BigDecimal的divide方法,除以100,保留2位小数,2位小数后面的直接省略,将分转成元
        bigDecimal = bigDecimal.divide(num, 2, BigDecimal.ROUND_DOWN);
        // 7.将得出的BigDecimal对象调用doubleValue方法转成double类型,并将double类型的结果返回
        System.out.println(bigDecimal.doubleValue());
    }
}
