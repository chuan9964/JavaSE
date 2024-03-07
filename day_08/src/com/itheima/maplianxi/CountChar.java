package com.itheima.maplianxi;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {

        Scanner sr= new Scanner(System.in);
        String text = sr.next();
        int[] count = new int[26];
        for (char c : text.toCharArray()) {
            count[c-'a']++;
        }

        // 输出结果
        for (int i = 0; i < 26; i++) {
            System.out.print((char)('a'+i)+"\t");
        }
        System.out.println();
        for (int i = 0; i < 26; i++) {
            System.out.print(count[i]+"\t");
        }
    }

}
