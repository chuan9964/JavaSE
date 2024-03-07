package com.itheima.io2;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo02 {
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
            想追加 构造需要加入一个参数  true
        */
        FileOutputStream fos = new FileOutputStream("day09\\src\\hehe.txt",true);

        fos.write("\n".getBytes());

        fos.write("你好吗".getBytes());
        //最后还要释放资源
        fos.close();
    }
}
