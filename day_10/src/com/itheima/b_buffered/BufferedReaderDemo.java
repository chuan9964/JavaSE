package com.itheima.b_buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {

    public static void main(String[] args) throws Exception{
        //创建 基本字符输入流
        FileReader fr = new FileReader("day10\\src\\咏鹅.txt");
        //创建 包装流  字符缓冲输入流
        BufferedReader br = new BufferedReader(fr);

        // String readLine() 每次读一行 如果读到结果是null 代表读完了

        String line ;
        while((line=br.readLine())!=null){
            System.out.println(line);//读一行 输出一行
        }



        br.close();
        fr.close();
    }
}
