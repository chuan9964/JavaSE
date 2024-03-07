package com.itheima.codeextend02;

public class Test {
    public static void main(String[] args) {
        Phone phone1 = new Phone("小米", 1999.0);
        Phone phone2 = new Phone("华为", 2999.0);
        Phone phone3 = new Phone("苹果", 3999.0);
        Phone.size = 6;

        System.out.println(phone1.toString());
        phone1.call();
        System.out.println(phone2.toString());
        phone2.sendMessage();
        System.out.println(phone3.toString());
        phone3.playGame();
    }
}
