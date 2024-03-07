package com.itheima.newdate;

import java.time.ZoneId;
import java.util.Set;

public class A_ZoneIdDemo {

    public static void main(String[] args) {
        // ZoneId 获取时区 操作时区的   都是静态方法
        //  Java中支持的时区
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());// 602
        System.out.println(zoneIds);//获取所有的时区

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);//Asia/Shanghai

        ZoneId zoneId1 = ZoneId.of("Etc/GMT+8");
        System.out.println(zoneId1);//根据时区字符串 获取一个时区对象


    }
}
