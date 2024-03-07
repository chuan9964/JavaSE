package com.itheima.testplus01;

public class TestPlus01 {
    public static void main(String[] args) {
        System.out.println(f(1));
    }

    private static int f(int day) {
        // 等到第10天的时候发现桃子只有1个了
        if (day == 10) return 1;

        // (当天数量 + 1(昨天多吃了一个)) *2 (还原前一天的数量)
        return (f(day + 1) + 1) * 2;
    }
}
