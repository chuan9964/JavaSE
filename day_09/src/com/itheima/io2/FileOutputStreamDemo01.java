package com.itheima.io2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo01 {
   /*
     字节输出流
        OutputStream 定义跟写相关的方法
        FileOutputStream  文件字节输出流
               创建一个内存和指定文件的 通道(流) 可以将内存中的数据
               内存 ======> 文件

       方法 都是跟写相关

    */
    public static void main(String[] args) throws IOException {
       /*
         构造
            FileOutputStream(目标文件对象)
            FileOutputStream(目标文件路径)
            创建一个有内存 通向 目标文件的 流  我们可以将内存的数据通过流写到目标文件中
            如果目标文件不存在，会自动创建。
            存在 会先清空再写
        */
        FileOutputStream fos = new FileOutputStream("day09\\src\\hehe.txt");
        // fos 写数据
        // 一次写一个字节
        fos.write(97);//97 字节-- a
        // 一次写一个字节数组---  字符串--字节数组
        byte[] bytes = "abcd".getBytes();
        fos.write(bytes);// 97 98 99 100  abcd
        // 一次写一个字节数组的一部分
//        fos.write(bytes,起始位值,长度);
        fos.write(bytes,1,2);
        //最后还要释放资源
        fos.close();
    }
}
