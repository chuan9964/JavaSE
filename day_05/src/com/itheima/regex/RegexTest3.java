package com.itheima.regex;

import java.util.Scanner;

public class RegexTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("校验 电话号码");
            String phone = sc.next();

            boolean flag = checkPhone(phone);

            if(flag){
                System.out.println("号码正确 可以发验证码");
                break;
            }else{
                System.out.println("号码错误,请重新输入。");
            }

        }

    }

    public static  boolean checkPhone(String phone){
        //请写一个正则表达式  来校验  手机号  电话号码
        String regex = "(1[3-9]\\d{9})|(0\\d{10})";
        // 手机号的规则  1开头 3-9 0-9 出现9次
        // 电话号码   03102445556  03193266037  01088888888  01088888888
                // 开头 0  0-9 出现10次
        return phone!=null && phone.matches(regex);
    }
}
