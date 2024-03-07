package com.itheima.a_charStream;

import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) throws Exception{
        /*
          学习 字符输出流
            每次都可以按照 字符形式写出去
            内存--->文件
            FileWriter
              构造有四个
                 一个参数  传递目标文件对象 目标文件路径
                 两个参数  实现追加的  后面的参数写true就是追加
         */

        //创建流对象
        FileWriter fw = new FileWriter("day10\\src\\hehe.txt");
        //写数据---灵活
        // 一次写一个字符出去
        fw.write('雷');
        fw.write(97);//'a'
        fw.write("\r\n");
        // 一次写一个字符数组出去
        char[] chs = {'鱼','虾','蟹','龟'};
        fw.write(chs);
        fw.write("\r\n");
        // 一次写一个字符数组一部分出去
        fw.write(chs,3,1);//龟
        fw.write("\r\n");

        // 一次写一个字符串出去
        fw.write("我是如来佛祖玉皇大帝观音菩萨取西经特派使者");
        fw.write("\r\n");
        // 一次写一个字符串一部分出去
        fw.write("abcde",2,2);//cd
        fw.write("\r\n");


        //释放资源
        fw.close();
    }
}
