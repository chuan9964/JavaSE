package com.itheima.test04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = simpleDateFormat.parse("2001-05-25");
        long timeSpan = System.currentTimeMillis() - birthday.getTime();
        int days = (int) (timeSpan / 24 / 60 / 60 / 1000);

        System.out.println("到现在活了：" + days + "天！");
    }
}
