package com.itheima.c_change;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    /*
      学习使用 字符输出转换流
        OutputStreamWriter
           作用 将 字符数据 按照指定的编码格式 写到文件中。
        使用
           字符流 =  字节流+编码表
           构造
              OutputStreamWriter(字节输出流,编码表的字符串形式)
           方法 跟  字符流学习的方法一致。
               write(一个字符串)
     */
    public static void main(String[] args) throws Exception{
        //1:创建字节输出流
        FileOutputStream fos = new FileOutputStream("day10\\src\\hello.txt");
        //2:创建字符输出转换流
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
        //3:写
        osw.write("你好");// utf-8 6个字节  GBK 4个字节
        osw.close();
        fos.close();
    }
}
