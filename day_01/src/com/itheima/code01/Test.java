package com.itheima.code01;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("刘伟传", 23, "418");
        student.fillForm();

        Teacher teacher = new Teacher("赵四", 20,"教务部");
        teacher.publishForm();
    }
}
