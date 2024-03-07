package com.itheima.test02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        // 1.创建HashMap集合,以商品名做键，以售出数量做值
        HashMap<String, Integer> hashMap = new HashMap<>();
        // 2.创建Scanner对象,键盘录入
        Scanner sr = new Scanner(System.in);
        // 3.一直输入商品，直到end结束
        String input = null;
        do {
            input = sr.next();
            if (hashMap.containsKey(input)) {
                // 包含这个物品 +1
                hashMap.put(input, hashMap.get(input) + 1);
            } else {
                // 不包含这个物品 加入1
                hashMap.put(input, 1);
            }
            //4.如果输入的是end,直接结束循环录入
        }while (!input.equals("end"));
        // 6.遍历查看结果
        hashMap.forEach((k, v) -> System.out.println(k + "出售数量：" + v));
    }
}
