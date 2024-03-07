package com.itheima.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
 一次读一个字节 原始循环写法
 */
public class FileInputStreamDemo {
    /*
      字节输入流
        抽象父类 InputStream   定义了很多进行读取的方法
        子类
           FileInputStream 操作的文件  进行文件的读取操作流
           每次 最小读取单位是字节，
     */
    public static void main(String[] args) throws IOException {
        /*
         构造方法:
            FileInputStream(文件对象)
            FileInputStream(文件路径)
         */
        // 封装 heihei.txt
        // 创建了一个字节输入流 由 文件 ====>======>通向内存 对于内存是读取操作
        FileInputStream fis = new FileInputStream("day09\\src\\heihei.txt");

        //通过流 读取数据
        //   int read() 每次读取一个字节 读完之后再调用读取下一个
//        int b1 = fis.read();
//        System.out.println(b1);//字节 97
//        int b2 = fis.read();
//        System.out.println(b2);//字节 98

        //  也就是 如果调用 read方法读取的结果是-1的时候 说明读完了....
        //提升大家能力到了 将上述操作改查循环处理   while...
        while(true){
            //读一个字节
            int b = fis.read();//int 可以接收byte （short char）
            if(b==-1){
                break;
            }
            System.out.println(b);
        }
        //优秀的程序员 使用完之后 关闭流 节约内存
        fis.close();
    }
}
