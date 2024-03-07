package com.itheima.file;

import java.io.File;

public class FileTest01 {
    /*
      目标:
         掌握File对象的创建。

     三个构造
        File(String 目标文件的路径)
        File(String parent,String chlid) 根据父路径和子路径 确定文件的路径
        File(File parent,String child)根据父路径的对象形式和子路径 确定文件的路径
     */
    public static void main(String[] args) {
       // 想要将  E:\418\download\a.txt 文件表达成File对象
         //     \java中是转义字符  \\ 表示一个 \  或者 / 表达 \
        File file = new File("E:\\418\\download\\a.txt");
//        new File("E:/418/download/a.txt");
        //file 表示了 E:\418\download目录下的 a.txt文件
        System.out.println(file);
        System.out.println("文件大小:"+file.length());
        //刚才封装的是文件  封装目录
        //  目录--文件夹 --也是写路径
        File dir = new File("E:\\418\\download");
        System.out.println(dir);
        System.out.println(dir.length());//程序中是 不去获取文件夹大小的...

        //封装方式二
        // 想要将  E:\418\download\a.txt 文件表达成File对象
        File file2 = new File("E:\\418\\download", "a.txt");
        System.out.println(file2);
        System.out.println(file2.length());

        //封装方式三
        // 想要将  E:\418\download\a.txt 文件表达成File对象
        File file3 = new File(dir, "a.txt");
        System.out.println(file3);
        System.out.println(file3.length());

        //总结: File可以表达文件和文件夹
        //  File在封装的时候  不去考虑 文件是否真实存在
        File file4 = new File("E:\\418\\download\\b.txt");
        System.out.println(file4.length());
    }
}
