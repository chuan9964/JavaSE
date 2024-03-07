package com.itheima.interface04.impl;

import com.itheima.interface04.Student;
import com.itheima.interface04.StudentOperator;

import java.util.ArrayList;

public class StudentOperatorImplB implements StudentOperator {

    @Override
    public void printAllInfo(ArrayList<Student> studens) {
        System.out.println("打印全部的学生信息：");
        int boyCount = 0;
        int grillCount = 0;
        for (int i = 0; i < studens.size(); i++) {
            Student student = studens.get(i);
            if (student.isBoy())
                boyCount++;
            else
                grillCount++;
        }
        System.out.println("男生有：" + boyCount + "个       女生有" + grillCount + "个");
        System.out.println("==============================");
    }

    @Override
    public void printAverageScore(ArrayList<Student> studens) {
        System.out.println("打印学生的平均成绩：");
        double sum = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < studens.size(); i++) {
            Student student = studens.get(i);
            sum += student.getScore();
            min = Math.min(min, student.getScore());
            max = Math.max(max, student.getScore());
        }
        double avg = (sum - max - min) / (studens.size() - 2);
        System.out.println("平均分数为：" + avg);
        System.out.println("==============================");
    }
}
