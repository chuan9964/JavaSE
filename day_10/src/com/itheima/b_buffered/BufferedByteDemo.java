package com.itheima.b_buffered;

import java.io.*;

public class BufferedByteDemo {
    /*
    字节缓冲流
        BufferedInputStream 字节缓冲输入流
        BufferedOutputStream 字节缓冲输出流
          特点
            对原始流进行包装，没有进行功能上的扩展,只进行性能提升(速度)
     */


    public static void main(String[] args) throws Exception {
        //  缓冲流构造中 传入基本流 原始流
        FileInputStream fis = new FileInputStream("day10\\src\\haha.txt");
        FileOutputStream fos = new FileOutputStream("day10\\src\\xixi.txt");
        //缓冲流创建
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //使用跟以前一样
        byte[] buffer = new byte[1024];
        int len;
        while((len=bis.read(buffer))!=-1){
            bos.write(buffer,0,len);
        }
        //释放资源
        bos.close();
        bis.close();
        fos.close();
        fis.close();

    }
}
