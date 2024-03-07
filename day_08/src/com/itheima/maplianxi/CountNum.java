package com.itheima.maplianxi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class CountNum {
    public static void main(String[] args) {
        String[] point = {"北交大", "河东院", "燕京理工", "河北经贸"};
        ArrayList<String> selects = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            // 随机生成景点选择
            String select = point[random.nextInt(4)];
            selects.add(select);
        }
        System.out.println("投票情况：" + selects);

        // 使用map统计景点选择情况
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String select : selects) {
            if (hashMap.containsKey(select)) {
                // 包含这个景点 +1
                hashMap.put(select, hashMap.get(select) + 1);
            } else {
                // 不包含这个景点 加入1
                hashMap.put(select, 1);
            }
        }

        // 输出结果
        hashMap.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
