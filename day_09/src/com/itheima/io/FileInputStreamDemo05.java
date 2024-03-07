package com.itheima.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo05 {
    /*
     一次一个字节数组形式读取 --- 循环写法
     */
    public static void main(String[] args) throws IOException {
        // 创建了一个字节输入流 由 文件 ====>======>通向内存 对于内存是读取操作
        FileInputStream fis = new FileInputStream("day09\\src\\heihei.txt");

        //通过流 读取数据
       /*
       字节流不适合读取中文，因为可能会在读取过程 造成 字符的切割 出现乱码
       执意要做  就创建一个超过 文件的字节数组 解决乱码问题
       创建的字节数组长度 浪费。。。
       有

        */
//        byte[] buffer = new byte[8];
//        int len = fis.read(buffer);
//        System.out.println(new String(buffer,0,len));

        byte[] bytes = fis.readAllBytes();
        System.out.println(new String(bytes));

        //优秀的程序员 使用完之后 关闭流 节约内存
        fis.close();
    }
}
