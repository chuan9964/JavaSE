package com.itheima.set02;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        /*
          创建一个学生集合  用来存储不同 学生对象
         */
        HashSet<Student> set = new HashSet<>();
        //创建学生对象
        Student stu1 = new Student("小磊",18,1.88);
        Student stu2 = new Student("淼鑫",28,1.38);
        Student stu3 = new Student("阿哲",22,1.78);
        Student stu4 = new Student("淼鑫",28,1.38);

        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu2);
        set.add(stu4);
        //我们没有重写 hashCode equals的时候可以存储进去的，
        // 原因是 存的时候先调用 hashCode方法(Object--根地址有一定关系) 哈希code不一样.
        // 即使哈希一样,也能存！！没有重写equals 比较的是地址值  不是一个元素。
        /*
           在开发过程中
               是地址值不一样就是不同对象吗？
               其实不尽然，我们开发中认为 两个对象如果 所有属性值都一样 认为是 同一个对象。
               在我们观点里面 stu2 stu4是同一个对象。
               默认情况下没有当成 同一个对象 并没有完成 元素的去重
         如果 想要达到开发标准 两个对象属性值都一样 就是同一个对象怎么做？
            重写
               hashCode()  -- 目的  是要根据内容算哈希值。
               equals()    -- 目的  是进行内容比较。
            重写之后
              stu2 stu4 先算出哈希值 哈希碰撞  位置一样 再进行equals比较 内容一样不存
         */


        for (Student student : set) {
            System.out.println(student);
        }
        /*
         存储元素原理
             先根据hashcode算出 存储位置
             位置上有元素 就进行equals比较。

         */
    }
}
