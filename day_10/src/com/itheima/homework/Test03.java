package com.itheima.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test03 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("E:\\讲义\\itheima\\code\\project_javaseup\\day_10\\src\\作业中需要的文件\\old.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        ArrayList<String> list = new ArrayList<>();

        String input;
        while ((input = bufferedReader.readLine()) != null) {
            list.add(input);
        }

        // 排序规则
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int o1len = o1.indexOf(".");
                int o2len = o2.indexOf(".");
                // 按当前数字比大小
                if (o1len == o2len) return o1.compareTo(o2);
                // 按位数比大小
                return o1len - o2len;
            }
        });

        list.forEach(System.out::println);

        FileWriter fileWriter = new FileWriter("E:\\讲义\\itheima\\code\\project_javaseup\\day_10\\src\\作业中需要的文件\\new.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String s : list) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
