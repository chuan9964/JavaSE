package com.itheima.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {
    /*
     一次一个字节形式读取 优化循环写法
     */
    public static void main(String[] args) throws IOException {

        // 封装 heihei.txt
        // 创建了一个字节输入流 由 文件 ====>======>通向内存 对于内存是读取操作
        FileInputStream fis = new FileInputStream("day09\\src\\heihei.txt");

        //通过流 读取数据

//        while(true){
//            //读一个字节
//            int b = fis.read();//int 可以接收byte （short char）
//            if(b==-1){
//                break;
//            }
//            System.out.println(b);
//        }

        int b ;
        //  b=fis.read() 将读取数据给了b  ()!=-1 对b的结果进行判断
        while((b=fis.read())!=-1){
            System.out.println(b);//解析 输出
        }

        //优秀的程序员 使用完之后 关闭流 节约内存
        fis.close();
    }
}
