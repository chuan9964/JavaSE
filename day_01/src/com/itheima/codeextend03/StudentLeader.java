package com.itheima.codeextend03;

public class StudentLeader extends Student{
    private String job;

    public StudentLeader() {
    }

    public StudentLeader(String name, String gender, int age, String nationality, String school, String stuNumber, String job) {
        super(name, gender, age, nationality, school, stuNumber);
        this.job = job;
    }

    @Override
    public void work() {
        System.out.println("学生需要学习！");
    }

    public void meeting(){
        System.out.println("学生干部喜欢开会!");
    }
}
