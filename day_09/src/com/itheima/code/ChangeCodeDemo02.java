package com.itheima.code;

import java.util.Arrays;

public class ChangeCodeDemo02 {
    public static void main(String[] args) {
        String str = "123456789abcde我我我";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        String res = new String(bytes);
        System.out.println(res);
    }
}
