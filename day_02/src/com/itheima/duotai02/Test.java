package com.itheima.duotai02;

public class Test {
    public static void main(String[] args) {
        GaZiDie gzd = new GaZi();
        System.out.println(gzd.age);

        gzd.teach();
        if (gzd instanceof GaZi gazi){
            gazi.play();
        }
    }
}
