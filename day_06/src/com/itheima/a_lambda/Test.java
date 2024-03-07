package com.itheima.a_lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {
        String[] names = {"boby", "angela", "Andy" ,"dlei", "caocao", "Babo", "jack", "Cici"};

        // 要求忽略首字符大小写进行排序。
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        Arrays.sort(names,(o1,o2)->o1.compareToIgnoreCase(o2));
        /*
          特定方法引用使用前提
             1:lambda表达式中 只调用了一个实例方法
             2:第一个参数作为主调调用了方法
             3:其他参数作为 实例方法的参数出现(顺序一致)
           格式:
             类型::方法名
             第一个参数的类型
         */
        Arrays.sort(names,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
