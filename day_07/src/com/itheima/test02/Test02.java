package com.itheima.test02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        // 1.创建Random随机数对象
        Random random = new Random();
        // 2.创建HashSet用于保存不重复的红球
        HashSet<Integer> set = new HashSet<>();
        // 3.循环判断红球数量是否小于6个
        while (set.size() < 6) {
            // 4.球数量小于6个就产生一个红球.添加到HashSet中
            int num = random.nextInt(33) + 1;
            // 5.如果产生重复号码，往HashSet里添加不进去，所以会再次生成号码
            set.add(num);
        }

        // 6.创建ArrayList集合, 将HashSet中的数据全部添加到ArrayList集合中
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(set);

        // 7.排序
        Collections.sort(list);

        // 8.再生成一个蓝球，将蓝球添加到ArrayList集合中
        int num = random.nextInt(16) + 1;
        list.add(num);

        // 9.打印中奖号码
        System.out.println(list);
    }
}
