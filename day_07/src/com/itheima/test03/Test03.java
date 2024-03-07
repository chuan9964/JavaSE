package com.itheima.test03;

import java.util.HashSet;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        //1.创建HashSet对象
        HashSet<User> users = new HashSet<User>();
        //2.创建Scanner对象
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名:");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            // 3.创建一个对象,将输入的用户名和密码封装成User对象
            User user = new User(username, password);
            // 4.添加到set集合,如果add返回的是true,证明可以添加,集合中没有重复的元素, 否则add方法返回false,证明不可以添加,集合中有重复的元素
            if (users.add(user)){
                System.out.println("添加成功");
            }else {
                System.out.println("用户名已存在");
            }
        }
    }
}
