package com.itheima.set03;


import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo01 {

    /*
      开发中不建议 用TreeSet存储自定义类型，因为会根据只定义排序内容进行去重，与实际开发不符。
        如果执意要用 你就得对所有的 属性进行排序比较 规则

      如果要用TreeSet存自定义类型
         1:自定义类型 实现 Comparable接口  实现排序规则。
         2:在 TreeSet 构造中 写出临时的排序规则 传递规则Comparator接口。

     */
    public static void main(String[] args) {

        //创建学生对象
       Student stu1 = new Student("小磊",18,1.88);
       Student stu2 = new Student("淼鑫",28,1.38);
       Student stu3 = new Student("阿哲",22,1.78);
       Student stu4 = new Student("宇迪",28,1.68);
      //创建 TreeSet集合
       TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               return o2.getAge()-o1.getAge();//按照年龄降序
           }
       });
        //存元素
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);

        for (Student student : set) {
            System.out.println(student);
        }

    }
}
