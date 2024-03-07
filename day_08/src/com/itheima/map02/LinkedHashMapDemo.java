package com.itheima.map02;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        //创建一个 存储 学生对象--籍贯对应 关系的 集合
        LinkedHashMap<Student,String> map = new LinkedHashMap<>();
        //每次存一个学生对象--籍贯
        Student stu1 = new Student("小学", 15);
        Student stu2 = new Student("中学", 19);
        Student stu3 = new Student("高中", 22);
        Student stu4 = new Student("小学", 15);
        //stu1 来自 吉林  stu2 黑龙江  stu3 辽宁
        map.put(stu1,"吉林");
        map.put(stu2,"黑龙江");
        map.put(stu3,"辽宁");
        map.put(stu4,"热河");//  map集合特点  键唯一
             // 没有重写 hashcode equals时候  两次new 就是两个不同的对象。
             // 我们会认为 stu1 stu4 的 内容一样就是相同的对象---需要我们去重写键的hashCode equals方法

        map.forEach((k,v)->{
            System.out.println(k+"="+v);
        });
    }
}
