package com.itheima.map02;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        //创建一个 存储 学生对象--籍贯对应 关系的 集合
        TreeMap<Student,String> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge()-o1.getAge();
            }
        });
        //每次存一个学生对象--籍贯
        Student stu1 = new Student("小学", 15);
        Student stu2 = new Student("中学", 19);
        Student stu3 = new Student("高中", 22);
        Student stu4 = new Student("小学", 15);
        //stu1 来自 吉林  stu2 黑龙江  stu3 辽宁
        map.put(stu1,"吉林");
        map.put(stu2,"黑龙江");
        map.put(stu3,"辽宁");
        map.put(stu4,"热河");


        map.forEach((k,v)->{
            System.out.println(k+"="+v);
        });
    }
}
