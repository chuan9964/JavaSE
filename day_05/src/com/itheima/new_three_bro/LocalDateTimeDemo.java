package com.itheima.new_three_bro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {

    public static void main(String[] args) {
        // 当前时间的的日历对象(包含年月日时分秒)
        LocalDateTime nowDateTime = LocalDateTime.now();//获取 年月日时分秒 精确到纳秒

        System.out.println("今天是:" + nowDateTime);//今天是：今天是:2024-02-03T11:32:25.514610600
        System.out.println(nowDateTime.getYear());//年 2024
        System.out.println(nowDateTime.getMonthValue());//月
        System.out.println(nowDateTime.getDayOfMonth());//日
        System.out.println(nowDateTime.getHour());//时
        System.out.println(nowDateTime.getMinute());//分
        System.out.println(nowDateTime.getSecond());//秒
        System.out.println(nowDateTime.getNano());//纳秒
// 日:当年的第几天
        System.out.println("dayofYear:" + nowDateTime.getDayOfYear());
//星期
        System.out.println(nowDateTime.getDayOfWeek());
        System.out.println(nowDateTime.getDayOfWeek().getValue());
//月份
        System.out.println(nowDateTime.getMonth());
        System.out.println(nowDateTime.getMonth().getValue());

        //  把  年月日 时分秒   可以把它 拆成 LocalDate  LocalTime
        LocalDate ld = nowDateTime.toLocalDate();
        System.out.println(ld);

        LocalTime lt = nowDateTime.toLocalTime();
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());
    }
}
