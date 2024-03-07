package com.itheima.code;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ChangeCodeDemo {

    /*
      完成编码和解码
         编码
           将字符按照指定的字符集 转换成 字节。
         解码
           将字节按照指定的字符集 转换成 字符。
       String中提供 编码和解码的方法
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码  字符串--字节数组
        String str = "a我b";
        // getBytes() 按照默认字符集
        byte[] bytes = str.getBytes();
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));
        // getBytes(String charsetName) 按照指定字符集
        byte[] gbks = str.getBytes("GBK");
        System.out.println(gbks.length);//4
        System.out.println(Arrays.toString(gbks));

        // 将字节按照指定的字符集 转换成 字符。解码操作
        // 字节---字符    字节数组---字符串
        //  String 有构造   String(byte[] bytes)// 将字节数组按照默认的字符集 进行转换成 字符串
        String s1 = new String(bytes);//按照 默认字符集
        System.out.println(s1);

        String s2 = new String(gbks);//按照A的方式编码 按照B的方式解码 会出现乱码
        System.out.println(s2);

        //  String 有构造   String(byte[] bytes,String charsetName)// 将字节数组按照指定的字符集 进行转换成 字符串
       String s3 = new String(gbks,"gbk");
        System.out.println(s3);

    }
}
