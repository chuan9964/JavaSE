package com.itheima.homework;

import java.io.*;

public class Test01 {
    // 1、定义convert方法,把指定编码的源文件转换成指定编码的目标文件
    public static void convert(String scrPath, String destPath, String srcCode, String destCode) throws IOException {
        // 1.1、创建InputStreamReader类的对象,指定编码表srcCode,绑定源文件srcPath
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(scrPath));
        // 1.2、创建OutputStreamWriter类的对象,指定编码表destCode,绑定目标文件destPath
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(destPath));
        // 1.3、循环读写
        inputStreamReader.transferTo(outputStreamWriter);
        // 1.4、关闭资源
        outputStreamWriter.close();
        inputStreamReader.close();

    }

    //2、定义convertGBK2UTF8方法,内部调用convert方法,实现GBK文件转换成UTF-8文件
    public static void convertGBK2UTF8(String srcPath,String destPath) throws IOException {
        convert(srcPath,destPath,"GBK","UTF-8");
    }

    //3、定义convertUTF82GBK	方法,内部调用convert方法,实现UTF-8文件转换成GBK文件
    public static void convertUTF82GBK(String srcPath,String destPath) throws IOException {
        convert(srcPath,destPath,"UTF-8","GBK");
    }
    // 4、定义测试类,完成以上GBK文件和UTF-8文件的互相转换

    public static void main(String[] args) throws IOException {
        String gbkFile = "day_10\\src\\作业中需要的文件\\gbk.txt";
        String utf8File = "day_10\\src\\作业中需要的文件\\utf8.txt";
        convertGBK2UTF8(gbkFile,utf8File);
        System.out.println("------以上完成GBK文件转换成UTF-8文件------");
        utf8File = "day_10\\src\\作业中需要的文件\\utf8_2.txt";
        gbkFile = "day_10\\src\\作业中需要的文件\\gbk_2.txt";
        convertUTF82GBK(utf8File,gbkFile);
        System.out.println("------以上完成UTF-8文件转换成GBK文件------");
    }
}
