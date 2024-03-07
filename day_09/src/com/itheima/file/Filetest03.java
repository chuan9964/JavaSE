package com.itheima.file;

import java.io.File;

public class Filetest03 {
    /*
     掌握
        File的判断方法
     */
    public static void main(String[] args) {
        File file1 = new File("E:\\418\\download\\a.txt");
        File file2 = new File("E:\\418\\download\\b.txt");
        File file3 = new File("E:\\418\\download\\haha.txt");

        // 请判断 file1 file2 file3是否都是真实存在的
        // exists()
        System.out.println("file1是否真实存在:"+file1.exists());//true
        System.out.println("file2是否真实存在:"+file2.exists());//false
        System.out.println("file3是否真实存在:"+file3.exists());//true

        //判断 file1是文件还是文件夹？ file3是文件还是文件夹？
        //     isFile()是否是文件 isDirectory()是否是文件夹
        System.out.println("file1是文件吗:"+file1.isFile());//true
        System.out.println("file1是文件夹吗:"+file1.isDirectory());//false
        System.out.println("file3是文件吗:"+file3.isFile());//false
        System.out.println("file3是文件夹吗:"+file3.isDirectory());//true

    }
}
