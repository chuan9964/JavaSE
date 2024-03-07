package com.itheima.b_buffered;

import java.io.*;

public class BufferedByteTest {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("E:\\讲义\\itheima\\code\\project_javaseup\\day_10\\src\\二组作业.zip");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("E:\\讲义\\itheima\\code\\project_javaseup\\day_10\\src\\二组作业2.zip");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedReader.transferTo(bufferedWriter);

        bufferedWriter.close();
        bufferedReader.close();

    }
}
