package com.itheima.interface04;

import com.itheima.interface04.impl.StudentOperatorImplA;
import com.itheima.interface04.impl.StudentOperatorImplB;

import java.util.ArrayList;

public class ClassManager {
    public static void main(String[] args) {
        //定义学生集合
        ArrayList<Student> students = new ArrayList<>();
        //添加学生对象
        Student stu1 = new Student("李易峰", "男", 36);
        Student stu2 = new Student("吴亦凡", "男", 37);
        Student stu3 = new Student("蔡徐坤", "男", 32);
        Student stu4 = new Student("赵薇", "女", 43);
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);
//        StudentOperator studentOperator = new StudentOperatorImplA();
        StudentOperator studentOperator = new StudentOperatorImplB();

        Student.studentOperator(students, studentOperator);
    }


}
