package com.itheima.a_charStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        File file = new File("day_10/src/com/itheima/a_charStream/abc.txt");
        FileReader fileReader = new FileReader(file);

        char[] buffer = new char[5];
        int len;
        while ((len = fileReader.read(buffer)) != -1){
            String s = new String(buffer,0,len);
            System.out.println(s);
        }

        fileReader.close();
    }
}
