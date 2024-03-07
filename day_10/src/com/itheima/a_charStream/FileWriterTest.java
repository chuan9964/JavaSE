package com.itheima.a_charStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("E:\\讲义\\itheima\\code\\project_javaseup\\day_10\\src\\com\\itheima\\a_charStream\\abc.txt");
        FileWriter fileWriter = new FileWriter("E:\\讲义\\itheima\\code\\project_javaseup\\day_10\\src\\com\\itheima\\a_charStream\\abc2.txt");
//        fileWriter.write("1111111111111");
//        fileWriter.write("\n");
//        fileWriter.write(new char[]{98,98,98,98,98});
//        fileWriter.close();
        int len;
        char[] buffer = new char[8];
        while ((len = fileReader.read(buffer)) != -1) {
            fileWriter.write(buffer, 0 ,len);
        }
        fileWriter.close();
        fileReader.close();
    }
}
