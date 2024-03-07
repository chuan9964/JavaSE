package com.itheima.b_buffered;

import java.io.*;
import java.nio.charset.Charset;

public class JDK11Demo {

    public static void main(String[] args) throws Exception{
//        reader();
        write();
    }

    /*
      FileReader新特性
     */
    public static void reader() throws Exception{
        // 如果文件是GBK 使用默认编码表UTF-8  有乱码 。  码表不对应！！
        Charset gbk = Charset.forName("GBK");
        FileReader fr =   new FileReader("day10\\src\\gbk文件哦.txt",gbk);
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


    public static void write() throws Exception{

        FileWriter fw = new FileWriter("day10\\src\\gbk2.txt",Charset.forName("GBK"));
        //3:写
        fw.write("你好");// utf-8 6个字节  GBK 4个字节
        fw.close();
    }
}
