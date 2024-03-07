package com.itheima.io2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    /*
      文件复制:
         将源文件的内容         copy 到       目标文件中
                     读到内存 从内存写到目标文件
     */
    public static void main(String[] args) throws IOException {
      /*
          文件复制 5步
           1:创建字节输入流 关联源文件。
           2:创建字节输出流 关联目标文件。
           边读边写
           3:将源文件内容读取到内存中。
           4:将内存中数据 写到目标文件中。

           5:释放资源
       */
//        1:创建字节输入流 关联源文件。
        FileInputStream in = new FileInputStream("D:\\upload\\img\\帅照.jpg");
//        2:创建字节输出流 关联目标文件。
        FileOutputStream out = new FileOutputStream("E:\\418\\点名\\小伙子真帅.jpg");
//        边读边写
//        3:将源文件内容读取到内存中。
        //采用字节数组
        byte[] buffer = new byte[1024*8];
        int len ;
        while((len=in.read(buffer))!=-1){
            // 数组 0 到len是真实数据
            //        4:将内存中数据 写到目标文件中。
            out.write(buffer,0,len);
        }
//
//        5:释放资源
        out.close();
        in.close();
        //从后往前不会丢
        //从小到大 不会错
    }
}
