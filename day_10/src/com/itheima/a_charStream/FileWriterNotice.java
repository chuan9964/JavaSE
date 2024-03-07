package com.itheima.a_charStream;

import java.io.FileWriter;

public class FileWriterNotice {
    public static void main(String[] args) throws Exception{

        //创建流对象
        FileWriter fw = new FileWriter("day10\\src\\haha.txt");
        //写数据---灵活
        // 一次写一个字符出去
        fw.write('雷');

        //除了字节流以外其他流需要刷新 才能 到文件中  '雷'在通道动 没有 移动到文件中
        //需要刷新
//        fw.flush();//刷新
        fw.write('神');
//        fw.flush();//刷新

        fw.close();//包含了刷新

    }
}
