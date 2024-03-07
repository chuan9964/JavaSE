package com.itheima.regex;

import java.util.Scanner;

public class RegexTest01 {

    public static void main(String[] args) {
        System.out.println("请您录入您的qq号，我来进行校验：");

        Scanner sc = new Scanner(System.in);

        String qq = sc.next();

        System.out.println("qq是否符合规则:"+checkQQ1(qq));
        System.out.println("qq是否符合规则:"+checkQQ2(qq));

    }

    /*
      设计一个方法 参数是一个字符串 返回值是 boolean
          校验一个 字符串 是否是符合规则 QQ号
     */
    public static boolean checkQQ1(String qq){
        /*
           qq号规则
               不能 null  不能以0 开头  长度  5-13位

         */
        // 1: 显眼包找出来---不符合找出返回 false
        if(qq==null || qq.startsWith("0")||qq.length()<5||qq.length()>13){
            return false;
        }
        // 不是0 开头了  长度在 5-13 范围内  不是null
        //  里面不能有 非数字  字符  只要发现有 非数字字符 返回false
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            if(ch<'0' || ch>'9' ){//不在数字范围内
                return false;
            }
        }
        //循环做完 没有 return 说明 是正确的
        return true;
    }
    /*
      正则的使用
         正则  表达正确规则的式子
     */
    public static boolean checkQQ2(String qq){

        return qq!=null && qq.matches("[1-9]\\d{4,12}");
    }

}
