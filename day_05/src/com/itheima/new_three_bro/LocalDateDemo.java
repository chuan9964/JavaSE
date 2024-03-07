package com.itheima.new_three_bro;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class LocalDateDemo {

    public static void main(String[] args) {
        //1.获取当前时间的日历对象(包含 年月日)
        LocalDate nowDate = LocalDate.now();
        System.out.println("今天的日期:" + nowDate);
       //2.获取指定的时间的日历对象
        LocalDate ldDate = LocalDate.of(2004, 2, 20);
        System.out.println("指定日期:" + ldDate);

        System.out.println("=============================");

     //3.get系列方法获取日历中的每一个属性值//获取年
        int year = ldDate.getYear();
        System.out.println("year: " + year);
       //获取月//方式一:
        Month m = ldDate.getMonth();
        System.out.println(m);
        System.out.println(m.getValue());

        //方式二:
        int month = ldDate.getMonthValue();
        System.out.println("month: " + month);

        //获取日
        int day = ldDate.getDayOfMonth();
        System.out.println("day:" + day);

        //获取一年的第几天
        int dayofYear = ldDate.getDayOfYear();
        System.out.println("dayOfYear:" + dayofYear);

        //获取星期
        DayOfWeek dayOfWeek = ldDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getValue());

      //is开头的方法表示判断
        System.out.println("是不是在当前时间之前:"+ldDate.isBefore(nowDate));
        System.out.println("是不是在当前时间之后:"+ldDate.isAfter(nowDate));

       //with开头的方法表示修改，只能修改年月日
        LocalDate withLocalDate = ldDate.withYear(2000);//修改得到是新的对象 原对象不变
        System.out.println("修改年之后新的时间:"+withLocalDate);

        //minus开头的方法表示减少，只能减少年月日
        LocalDate minusLocalDate = ldDate.minusYears(1);
        System.out.println("减少1年之后"+minusLocalDate);


        //plus开头的方法表示增加，只能增加年月日
        LocalDate plusLocalDate = ldDate.plusDays(1);
        System.out.println("增加一天之后:"+plusLocalDate);

    //-------------
   // 判断今天是否是你的生日
        LocalDate birDate = LocalDate.of(2000, 2, 3);
        LocalDate nowDate1 = LocalDate.now();

        //  扩展 年月日对象 月中的天对象  9月28日
        MonthDay birMd = MonthDay.of(birDate.getMonthValue(), birDate.getDayOfMonth());
        MonthDay nowMd = MonthDay.from(nowDate1);// 2 3

        System.out.println("今天是你的生日吗? " + birMd.equals(nowMd));//今天是你的生日吗?

    }
}
