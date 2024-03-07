package com.itheima.test02;


import java.text.ParseException;
import java.util.Calendar;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = sc.nextInt();
        int month = 2;
        int day = 1;
        //创建日历对象
        Calendar calendar = Calendar.getInstance();
        //设置这个日期为日历类
        calendar.set(year, month, day);

        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(calendar.getTime()+ " 这个月有："+dayOfMonth+"天");

        //日期类，减去 1天
        calendar.add(Calendar.DAY_OF_MONTH, -1);

        dayOfMonth = calendar.get(Calendar.DATE);
        System.out.println(calendar.getTime()+ " 这个月有："+dayOfMonth+"天");

        if (dayOfMonth == 28){
            System.out.println("这个年有365天");
        }else{
            System.out.println("这个年有366天");
        }
    }
}
