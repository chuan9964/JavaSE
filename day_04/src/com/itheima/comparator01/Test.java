package com.itheima.comparator01;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        //已有一个数组
        Integer[] arr = {6,5,7,9,3,1,2};
        //请完成数测排序阿达
//        Arrays.sort(arr);
//        System.out.println("展示数组内容:"+Arrays.toString(arr));
        // 进行的是一个升序排序
        //问题  数组中的元素完成降序排序
//        public static void sort(数组) 对数组进行 排fe (排序规则 默认 升序)
//        public static void sort(数组,排序规则)
        //                            Comparator -- 比较器
        //     public interface Comparable<T>  <T> 泛型  <类型需要排序>
        //        public int compareTo(T o);抽象方法
        // 接口作为参数  --  传递实现类对象  匿名内部类
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println("展示数组内容:"+Arrays.toString(arr));
        /*
          原始规则
               升序
                  左边数据>右边数据   返回 正整数   交换位置
                  左边数据<右边数据   返回 负整数   不交换
                  左边数据=右边数据   返回 0       不交换
               降序
                  左边数据<右边数据   返回 正整数   交换位置
                  左边数据>右边数据   返回 负整数   不交换
                  左边数据=右边数据   返回 0       不交换
           简单规则
              前 - 后 升序
              后 - 前  降序


         */
        /*
        总结:
           如果 我们在开发中 想要对 整数 小数 (包装)数组 不满足使用Arrays的默认排序
             那么可以采用 Arrays.sort(引用类型数组,自己实现定义的规则)
             自己定义规则就是实现 Comparator接口 建议使用 匿名内部类形式去写
                重写 比较的方法
                    特点  前-后  升序   后-前 降序

         */

        Double[] arr2 = {3.14,5.34,1.22,4.33};
        //排序
//        Arrays.sort(arr2);//默认规则
        Arrays.sort(arr2, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                //       Double里面有 比较的方法 compare
//                return Double.compare(o1,o2); 升序 前后

                return Double.compare(o2,o1);//降序  后前
            }
        });
        System.out.println("展示数组内容:"+Arrays.toString(arr2));

    }
}
