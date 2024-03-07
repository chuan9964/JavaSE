package com.itheima.test03;

public class Student {
    private String className;
    private String name;
    private int score;

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public Student(String className, String name, int score) {
        this.className = className;
        this.name = name;
        this.score = score;
    }
    public Student(String s) {
        String[] arr = s.split(",");
        this.className = arr[0];
        this.name = arr[1];
        this.score = Integer.parseInt(arr[2]);
    }
    public Student() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
