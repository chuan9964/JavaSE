package com.itheima.a_charStream;

import java.io.FileReader;

public class FileReaderDemo {
   /*
     掌握
        字符输入流  FileReader

    */
    public static void main(String[] args) throws Exception{
        /*
        流的操作规律
           创建流对象
           读、写
           释放资源
         */
        /*
          学习创建对象
             FileReader(File 源文件对象)
             FileReader(File 源文件路径)
         */
        FileReader fr = new FileReader("day10\\src\\heihei.txt");
        //2:读取数据
        // int read() 一次读一个字符  只不是使用int接收   int数据怎么变成char数据  (char)
        //循环形式 一次读一个字符
//        int c;//c接收读取的字符
//        while((c=fr.read())!=-1){
//            System.out.println((char)c);//转换成字符展示
//        }
       //采用字符数组读取 一次读取一个字符数组
        char[] chs = new char[3];//每次最多读取3个长度的字符
        int len;//读取字符数组的实际长度
        while((len=fr.read(chs))!=-1){
            //chs 字符数组  len 读取到字符长度
            //  new String(字符数组,起始索引,取的长度)
            String s = new String(chs, 0, len);
            System.out.println(s);
        }
        //3:释放资源
        fr.close();
    }
}
