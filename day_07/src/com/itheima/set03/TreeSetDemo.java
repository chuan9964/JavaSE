package com.itheima.set03;


import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    /*
      TreeSet
        底层是一个 二叉排序树
           遵循特点
             小的存左边 大的存右边 一样的不存
        里面的存储的元素必须具备 ！！排序功能！！ 元素之间有大小关系
     */
    public static void main(String[] args) {

        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(13);
        set1.add(15);
        set1.add(12);
        set1.add(33);
        set1.add(26);
        set1.add(13);
        set1.add(14);

        System.out.println(set1);
        /*
          TreeSet去重原则  一样的不存
          存完之后元素进行排序
            是因为 存储的元素类型有排序规则
               implements Comparable<Integer>
               实现 Comparable 代表有了排序的规则 所以可以使用TreeSet存储
            TreeSet 去重的原理
                是排序的规则 如果一样就不存。
         */

        System.out.println("==========");
       TreeSet<String>  set2 = new TreeSet<>();
       set2.add("cba");
       set2.add("cbb");
       set2.add("aba");
       set2.add("bbb");
       set2.add("cbb");
       System.out.println(set2);





    }
}
