package com.itheima.test01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        //1.定义一个ArrayList集合 list
        ArrayList<Student> list = new ArrayList<>();
        //2.创建4个学生对象
        Student stu1 = new Student(1,"小A",60);
        Student stu2 = new Student(2,"小B",70);
        Student stu3 = new Student(3,"小C",80);
        Student stu4 = new Student(4,"小D",90);
        //3.调用add方法将4个方法存到list集合中
        Collections.addAll(list, stu1, stu2, stu3, stu4);
        //4.利用Collections中的sort方法将4个学生按照考试成绩进行排序
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore() - o2.getScore();
            }
        });
        //5.遍历集合,将属性值输出出来
        list.forEach(System.out::println);
    }
}
