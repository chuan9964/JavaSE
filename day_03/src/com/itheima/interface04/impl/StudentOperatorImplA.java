package com.itheima.interface04.impl;

import com.itheima.interface04.Student;
import com.itheima.interface04.StudentOperator;

import java.util.ArrayList;

public class StudentOperatorImplA implements StudentOperator {

    @Override
    public void printAllInfo(ArrayList<Student> studens) {
        System.out.println("打印全部的学生信息：");
        for (int i = 0; i < studens.size(); i++) {
            Student student = studens.get(i);
            System.out.println(student);
        }
        System.out.println("==============================");
    }

    @Override
    public void printAverageScore(ArrayList<Student> studens) {
        System.out.println("打印学生的平均成绩：");
        double sum = 0;
        for (int i = 0; i < studens.size(); i++) {
            Student student = studens.get(i);
            sum += student.getScore();
        }
        double avg = sum / studens.size();
        System.out.println("平均分数为：" + avg);
        System.out.println("==============================");
    }
}
