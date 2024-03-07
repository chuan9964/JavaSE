package com.itheima.overwrite;

public class Test {
    public static void main(String[] args) {
        Hashiqi hashiqi = new Hashiqi();
        hashiqi.eat();
        hashiqi.chaiHome();
        hashiqi.drink();
        hashiqi.lookDoor();
        System.out.println("------------------------");
        Shapigou shapigou = new Shapigou();
        shapigou.eat();
        shapigou.drink();
        shapigou.lookDoor();
        System.out.println("------------------------");
        Zhonghuatianyuanquan zhonghuatianyuanquan = new Zhonghuatianyuanquan();
        zhonghuatianyuanquan.eat();
        zhonghuatianyuanquan.drink();
        zhonghuatianyuanquan.lookDoor();
    }
}
