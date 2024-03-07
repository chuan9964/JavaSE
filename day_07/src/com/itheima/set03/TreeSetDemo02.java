package com.itheima.set03;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo02 {
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
                return o2.getAge() -o1.getAge()  ;
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
