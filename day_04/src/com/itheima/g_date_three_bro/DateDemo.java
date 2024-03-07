package com.itheima.g_date_three_bro;

import java.util.Date;

public class DateDemo {
    /*
       Date 日期对象
          空参 创建当前的时间对象
     */
    public static void main(String[] args) {
        // 空参构造
        Date date = new Date();
        System.out.println(date);//当前时间
        // 带参构造 参数就是毫秒值  距离时间原点的毫秒值
        Date date1 = new Date(60 * 60 * 1000);
        System.out.println(date1);//时间原点一小时  1970 1 1 01:00:00
                                  //              1970 1 1 08:00:00
        // getTime 获取 距离时间原点毫秒值
        long time = date1.getTime();
        System.out.println(time);
        // setTime 改变 日期时间 根据毫秒值改变
        date1.setTime(0);


        System.out.println(date1);
    }
}
