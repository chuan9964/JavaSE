package com.itheima.interface04;

import java.util.ArrayList;

public class Student {
    private String name;
    private String gender;
    private double score;

    public Student() {
    }

    public Student(String name, String gender, double score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getScore() {
        return score;
    }

    public boolean isBoy(){
        return getGender().equals("男");
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "姓名='" + name + '\'' +
                ", 性别='" + gender + '\'' +
                ", 成绩=" + score +
                '}';
    }

    public static void studentOperator(ArrayList<Student> students, StudentOperator studentOperator) {
        studentOperator.printAllInfo(students);
        studentOperator.printAverageScore(students);
    }
}
