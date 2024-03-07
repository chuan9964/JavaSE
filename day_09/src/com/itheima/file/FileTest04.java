package com.itheima.file;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest04 {
    /*
     掌握 File的获取方法

     */
    public static void main(String[] args) {

        File file1 = new File("E:\\418\\download\\a.txt");//绝对路径
        File file2 = new File("day09\\src\\heihei.txt");//相对路径
        //1:获取文件的名字 getName()  后缀名属于文件名一部分
        System.out.println("file1的名字:"+file1.getName());//a.txt
        System.out.println("file2的名字:"+file2.getName());//heihei.txt
        //2: 获取 文件的字节数 length()
        System.out.println("file1的字节数:"+file1.length());
        System.out.println("file2的字节数:"+file2.length());
        //3:获取文件的最后修改时间 long lastModified()获取的是毫秒值
        long l = file1.lastModified();
        //时间毫秒值  变成指定的 yyyy-MM-dd HH:mm:ss
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("file1的最后修改时间:"+sdf.format(l));
        // 4:获取路径
        //  getPath()  获取封装路径  封装是什么得到是什么
        System.out.println("file1的封装路径:"+file1.getPath());
        System.out.println("file2的封装路径:"+file2.getPath());
        //  getAbsolutePath()获取绝对路径 带盘符的路径
        System.out.println("file1的封装路径:"+file1.getAbsolutePath());
        System.out.println("file2的封装路径:"+file2.getAbsolutePath());

    }
}
