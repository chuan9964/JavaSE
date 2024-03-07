package com.itheima.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo04 {
    /*
     一次一个字节数组形式读取 --- 循环写法
     */
    public static void main(String[] args) throws IOException {
        // 创建了一个字节输入流 由 文件 ====>======>通向内存 对于内存是读取操作
        FileInputStream fis = new FileInputStream("day09\\src\\heihei.txt");

        //通过流 读取数据
       /*
         int read(byte[] bys)
           每次使用一个字节数组去读取,  数据放在数组中。
           返回值读取 真实 数据的 个数！！！
           如果数组读取的是没有 内容了 就是 -1

           学习两个转换字符串的方法
                new String(byte[] bys);
                new String(byte[] bys,int begin,int length);

        */
        byte[] buffer = new byte[3];

        int len;//表达每次读取的长度
        // 长度为-1不能读
        while((len= fis.read(buffer))!=-1){
            // buffer是 一个用来存储读取数据的数组
            // 那么请问 该数组中 里面的元素 都是本次读取的吗？不一定
            //  真实的读取个数 是 len个
            //  buffer  索引  0  1  2  3 ....buffer.length-1
            // 请问 真实读取个数 len 那部分是 真实读取数据  前len个！！！
            // 交给大家一个好玩的方法   String(byte[] buffer,int 起始索引,int 长度)
                                        // 将字节数组一部分 按照默认的编码 转换成字符
            // 将真实数据转成字符串
            String s = new String(buffer, 0, len);//转换真实读取的字节数
            System.out.println(s);
        }
        // a b c    d e ?    ??
        // 在转换字符的时候 出现了? 为什么呢 第二次读的时候  1/3 个汉字 所以出现了乱码
        //  建议以后  读取带有中文的文件 不要直接使用字节输入流 ---字符输入流




        //优秀的程序员 使用完之后 关闭流 节约内存
        fis.close();
    }
}
