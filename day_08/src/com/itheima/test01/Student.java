package com.itheima.test01;

public class Student {
    private int num ;
    private String name ;
    private int score ;


    public Student() {
    }

    public Student(int num, String name, int score) {
        this.num = num;
        this.name = name;
        this.score = score;
    }

    /**
     * 获取
     * @return num
     */
    public int getNum() {
        return num;
    }

    /**
     * 设置
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return score
     */
    public int getScore() {
        return score;
    }

    /**
     * 设置
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    public String toString() {
        return "Student{num = " + num + ", name = " + name + ", score = " + score + "}";
    }
}
