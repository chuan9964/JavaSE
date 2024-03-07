package com.itheima.test04;
public class Test {
    public static void main(String[] args) {
        int count=0;
        for (int i = -10; i < 5.9; i++) {
            if(Math.abs(i)>6 || Math.abs(i)<2.1){
                count++;
            }
        }
        System.out.println(count);
    }
}