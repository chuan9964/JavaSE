package com.itheima.newdate;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class B_InstantDemo {

    public static void main(String[] args) {
        //在以前 开发时候 习惯把 毫秒值 称为时间戳  表示毫秒级别的时间点
        //   System.currentTimeMillis()  Date 也是精确到毫秒
        // 需要精确到纳秒 Instant表示纳秒级别的时间戳   说白了就是将时间精确到纳秒级别
        //获取当前的 时间戳对象
        Instant now = Instant.now();
        System.out.println(now);//Instant精确到纳秒  2024-02-03T02:12:24.428742Z
        System.out.println(new Date());

        // 时间戳  都是 跟 时间原点
//        new Date(1000)// 原点+1秒
        Instant instant1 = Instant.ofEpochMilli(0L);//毫秒
        System.out.println(instant1);
        Instant instant2 = Instant.ofEpochMilli(1000L);//毫秒
        System.out.println(instant2);
        Instant instant3 = Instant.ofEpochSecond(3L);//秒
        System.out.println(instant3);
//        Instant.ofEpochSecond(秒数,纳秒数)
        Instant instant4 =Instant.ofEpochSecond(1,3000000000L);
        System.out.println(instant4);

        //Instant 表示的是  标准时间的时间戳
        System.out.println("标准时间的时间戳:"+now);//2024-02-03T02:19:06.078588500Z
        ZonedDateTime dateTime = now.atZone(ZoneId.of("Asia/Shanghai"));
        // ZonedDateTime 带时区的时间
        System.out.println(dateTime);

        Instant instant5 = Instant.ofEpochMilli(0L);//0毫秒
        Instant instant6 = Instant.ofEpochMilli(2000L);// 2秒
        //  isXxx 判断时间
        System.out.println("5的时间戳在6的后面吗?"+instant5.isAfter(instant6));// false

        // minusXxx 减少系列时间
        Instant instant7 = instant6.minusSeconds(60L);
        //               减少的时间 会生成一个新的对象 原来对象不会发生变化
        System.out.println(instant7);

        // plusXxx() 增加时间系列
        Instant instant8 = instant6.plusSeconds(60L);
        System.out.println(instant8);
    }
}
