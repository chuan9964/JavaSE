package com.itheima.b_buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {

    public static void main(String[] args) throws Exception {
        // BufferedWriter 字符缓冲输出流  提供了一个换行的方法
        //基本流 原始流 字符输出流
        FileWriter fw = new FileWriter("day10\\src\\草.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("离离原上草");
//        bw.write("\r\n");
        bw.newLine();//这是换行 newLine()
        bw.write("一岁一枯荣");
        bw.newLine();
        bw.write("野火烧不尽");
        bw.newLine();
        bw.write("春风吹又生");

        bw.close();
    }
}
