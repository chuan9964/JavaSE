package com.itheima.codeextend03;

public class Test {

    public static void main(String[] args) {
        Student student = new Student("刘伟传", "男", 23, "中国", "河北东方大学", "2001");
        student.work();

        Worker worker = new Worker("lwc","男", 23, "中国", "项目部", 5);
        worker.work();

        StudentLeader studentLeader = new StudentLeader("lwc","男", 23, "中国","河北东方大学", "2001", "讲师");
        studentLeader.work();

    }


}
