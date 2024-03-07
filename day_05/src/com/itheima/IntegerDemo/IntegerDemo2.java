package com.itheima.IntegerDemo;

public class IntegerDemo2 {

    public static void main(String[] args) {
        /*
          基本类型  和   字符串的转换
         */
        // 基本类型---->字符串
        int a = 10;
        String s1 = a+"";//推荐用法
        String s2 = String.valueOf(a);
        String s3 = Integer.toString(a);

        //字符串 --基本类型
        String str = "123";
        /*
          Integer  这些包装类
             都有一个功能

            static xxx parseXxx("对应类型字符串")
         */
        int i = Integer.parseInt(str);
        System.out.println(i);

        String str2 = "3.14";
        //double
        double v = Double.parseDouble(str2);
        System.out.println(v);

        int[] arr = new int[1];
        Integer.valueOf(arr[2]);

    }
}
