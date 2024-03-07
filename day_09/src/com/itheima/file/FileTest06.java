package com.itheima.file;

import java.io.File;

public class FileTest06 {

    /*
     目标
        掌握 遍历文件夹的方法
     */
    public static void main(String[] args) {
        File dir = new File("E:\\418\\download");
        //当前目录下 有很多文件和文件夹  我想获取怎么获取呢
        // String[] list()  获取的当前目录下 每个文件及文件夹的名字String
        String[] list = dir.list();
        //先判断是否为null以及是否有内容
        for (String s : list) {
            System.out.println("子文件(夹)的名字:"+s);
        }
        System.out.println("===================");
        //File[] listFiles() 获取当前目录下 每个文件及文件夹的对象形式File
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println("查看一下每个文件的绝对路径:"+file.getAbsolutePath());
        }
    }

}
