package com.itheima.c_change;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class InputStreamReaderDemo02 {
    /*
      字符流= 字节流+编码表

     */
    public static void main(String[] args) throws Exception{

     /*
       使用字符输入转换流 解决 读取文件和程序编码不一致问题
         使用套路
            1:先获取原始的字节流。
            2:按照真实的字符集编码转换成 字符输入流(字符输入转换流)
            // 字符输入转换流== 字符输入流 方法API都一样
      */
        // 1:先获取原始的字节流。
        FileInputStream fis = new FileInputStream("day10\\src\\gbk文件哦.txt");
        //  2:按照真实的字符集编码转换成 字符输入流(字符输入转换流)
        InputStreamReader isr = new InputStreamReader(fis, "GBK");
        //isr 是字符流 字符输入流  字符输入转换流

        //包装--因为包装流可以一次读一行
        BufferedReader br = new BufferedReader(isr);

        //使用
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        br.close();
        isr.close();
        fis.close();



    }
}
