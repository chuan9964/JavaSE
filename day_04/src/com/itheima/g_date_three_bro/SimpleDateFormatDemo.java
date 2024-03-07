package com.itheima.g_date_three_bro;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatDemo {
    /*
    SimpleDateFormat
      可以将 Date类型对象  时间毫秒值 转换成 对应的字符串格式
      对象创建过程中 需要 设置好  时间格式的！！！
          yyyy  MM  dd

       构造
            SimpleDateFormat(规则字符串)

     */
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //想把谁转换成字符串
        Date date = new Date();
        System.out.println(date);
        //需要学习转换方法  String format(日期/毫秒值) 返回一个有格式字符串
        // 日期对象---指定格式的字符串
        String dateStr1 = sdf.format(date);
        System.out.println(dateStr1);
         // 毫秒值---指定字符串
        String format = sdf.format(3600000);
        System.out.println(format);


        Calendar a = Calendar.getInstance();

        a.add(Calendar.MONTH,1);

    }
}
