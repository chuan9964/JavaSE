package com.itheima.newdate;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C_ZonedDateTime {
    public static void main(String[] args) {
        // ZonedDateTime 带时区的时间（精确到纳秒的时区时间）
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        // 获取指定时间的 时区时间   单独指定时间   年月日  时分秒 纳秒  时区
        ZonedDateTime zdt = ZonedDateTime.of(1999,3,6,
                 10,34,20,1111, ZoneId.systemDefault());
        System.out.println(zdt);
        // withXxx 修改系列时间
        ZonedDateTime newNow = now.withDayOfYear(3);//一年的第三天
        System.out.println(now);//2024-02-03T10:36:30.692138200+08:00[Asia/Shanghai]
        System.out.println(newNow);//2024-01-03T10:36:30.692138200+08:00[Asia/Shanghai]

        // minusXxx()
        ZonedDateTime dayNow = now.minusDays(2);
        System.out.println(now);//2024-02-03T10:37:54.192156+08:00[Asia/Shanghai]
        System.out.println(dayNow);//2024-02-01T10:37:54.192156+08:00[Asia/Shanghai]

        //plus
        ZonedDateTime fangjiaNow = now.plusDays(2);
        System.out.println(now);//2024-02-03T10:37:54.192156+08:00[Asia/Shanghai]
        System.out.println(fangjiaNow);//2024-02-05T10:37:54.192156+08:00[Asia/Shanghai]

    }
}
