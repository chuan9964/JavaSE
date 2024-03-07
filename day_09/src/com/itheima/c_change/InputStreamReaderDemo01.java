package com.itheima.c_change;

import java.io.*;

public class InputStreamReaderDemo01 {
    /*
      字符流= 字节流+编码表

     */
    public static void main(String[] args) throws Exception{

      // FileReader 操作文件字符输入流的便捷类！！
        //      文件底层都是字节！！  底层遵循的一个编码表---程序默认编码表UTF-8
        //  UTF-8 的编(解)码规则   ---- GBK 编(解)码规则
        // 如果文件是UTF-8 使用默认编码表 读取没有乱码。
        // 如果文件是GBK 使用默认编码表UTF-8  有乱码 。  码表不对应！！
      FileReader fr =   new FileReader("day10\\src\\gbk文件哦.txt");
        //包装--因为包装流可以一次读一行
      BufferedReader br = new BufferedReader(fr);

        //使用
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        br.close();
        fr.close();



    }
}
