package com.itheima.file;

import java.io.File;

public class FileTest02 {

    /*
    目标:辨析
        绝对路径:
             带盘符的路径
        相对路径:
             不带盘符路径 idea相对当前工程来说
                        E:\\418\\code
     */
    public static void main(String[] args) {
        // 绝对路径
        File file = new File("E:\\418\\code\\day09\\src\\heihei.txt");
        System.out.println(file.length());
        //相对路径
        File file2 = new File("day09\\src\\heihei.txt");
        System.out.println(file2.length());

    }
}
