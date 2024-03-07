package com.itheima.f_generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {

    public static void main(String[] args) {
        /*
          Collection 是 ArrayList祖宗
         */
//        Collection<String> con = new ArrayList<>();//多态
//        ArrayList<String> list = new ArrayList<>();//本态
        //采用多态？为什么呢？  多态特点  多态下只能调用 父中定义的功能，不会调用子类特有的。
        // 我们要研究是 共性的功能 使用多态
        Collection<String> con = new ArrayList<>();//多态
        // add()
        con.add("赵四");
        con.add("刘能");
        con.add("谢广坤");
        con.add("王老七");
        System.out.println(con);
        //size() 获取集合长度 元素个数
        System.out.println("集合中有"+con.size()+"个元素");
        // boolean contains(元素)  判断集合中是否包含指定元素
        System.out.println("是否包含张三 "+con.contains("张三"));//false
        System.out.println("是否包含赵四 "+con.contains("赵四"));//true
        //boolean remove(元素)  删除指定元素 返回 是否删除成功
        System.out.println("删除一下:王老七 "+con.remove("王老七"));
        System.out.println(con);
        //情况集合方法 void clear()
        con.clear();
        System.out.println("清空集合之后:"+con);
        // isEmpty() 判断集合是否为空
        System.out.println("con当前是空的吗?"+con.isEmpty());
        // 重写添加数据
        con.add("谢大脚");
        con.add("王小蒙");
        con.add("香秀");
        con.add("王云");
        // Object[] toArray() 变成数组
        Object[] array = con.toArray();
        System.out.println(Arrays.toString(array));
        //扩展一个


        Collection<String> c1 = new ArrayList<>();//多态
        // add()
        c1.add("赵四");
        c1.add("刘能");
        c1.add("谢广坤");
        c1.add("王老七");

        Collection<String> c2 = new ArrayList<>();//多态
        // add()
        c2.add("谢大脚");
        c2.add("王小蒙");
        c2.add("香秀");
        c2.add("王云");

        c1.addAll(c2);//c2集合内容 批量添加到c1中
        System.out.println(c1);
    }
}
