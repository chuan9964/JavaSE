package com.itheima.fileinput;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo03 {
    /*
     一次一个字节数组形式读取
     */
    public static void main(String[] args) throws IOException {

        // 封装 heihei.txt
        // 创建了一个字节输入流 由 文件 ====>======>通向内存 对于内存是读取操作
        FileInputStream fis = new FileInputStream("day_09\\src\\heihei.txt");

        //通过流 读取数据
       /*
         int read(byte[] bys)
           每次使用一个字节数组去读取,  数据放在数组中。
           返回值读取 真实 数据的 个数！！！
           如果数组读取的是没有 内容了 就是 -1
        */
        byte[] buffer = new byte[3];
        //容量为3的数组
        int read1 = fis.read(buffer);
        // read1
        System.out.println(read1);//3
        System.out.println(Arrays.toString(buffer));//97 98 99

        int read2 = fis.read(buffer);
        // read2
        System.out.println(read2);//3
        System.out.println(Arrays.toString(buffer));//100 101 -26

        int read3 = fis.read(buffer);
        // read3
        System.out.println(read3);//2
        System.out.println(Arrays.toString(buffer));//-120, -111, -26

        int read4 = fis.read(buffer);
        // read4
        System.out.println(read4);//-1




        //优秀的程序员 使用完之后 关闭流 节约内存
        fis.close();




        FileInputStream stream = new FileInputStream("day_09\\src\\heihei.txt");
        byte[] buff = new byte[5];
        int read = stream.read(buff);
        System.out.println(read);
        System.out.println(Arrays.toString(buff));


    }
}
