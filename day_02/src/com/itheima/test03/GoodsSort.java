package com.itheima.test03;

import java.util.Arrays;
import java.util.Scanner;

public class GoodsSort {
    /**
     * 那么新添的商品也会按照价格从低到高重新排序,请设计一个程序,完成添加新商品之后价格重新排序.
     */

    public static void main(String[] args) {
        // 1.创建Scanner对象,输入要添加商品的价格
        Scanner sr = new Scanner(System.in);
        // 2.定义老数组,存储原始商品的价格
        double[] oldArr = {1.0, 2.1, 3.2, 4.5, 5.6};
        // 3.定义新数组,将新商品的价格添加到新数组中
        double[] addArr = new double[3];
        for (int i = 0; i < 3; i++) {
            addArr[i] = sr.nextDouble();
        }
        // 4.将老数组中的价格复制到新数组中
        double[] newArr = Arrays.copyOf(oldArr, oldArr.length + addArr.length);
        // 5.将新添加的商品价格放到新数组中
        for (int i = 0; i < addArr.length; i++) {
            newArr[oldArr.length + i] = addArr[i];
        }
        // 6.将新添加的商品价格放到新数组中,重新排序
        Arrays.sort(newArr);
        // 7.展示排序之后的新数组
        System.out.println(Arrays.toString(newArr));
    }
}
