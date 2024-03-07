package com.itheima.copyobject;

import java.io.*;

public class TestPlus {
    public static void main(String[] args) throws IOException {
        File file = new File("day_09\\src\\com\\itheima\\copyobject\\srcDir");
        eachFile(file);

    }

    private static void eachFile(File file) {
        if (file.isFile()) {
            // 遍历文件
            System.out.println(file.getAbsolutePath());

        }

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            // 遍历文件夹
            if (files == null) return;
            for (File item : files) {
                // 在这里创建文件夹

                eachFile(item);
            }


        }
    }
}
