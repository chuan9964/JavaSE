package com.itheima.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test02 {
    public static void main(String[] args) throws IOException {
        //1、创建List集合对象,泛型: String
        Stack<String> stack = new Stack<>();

        //2、创建字符缓冲输入流对象,绑定源文件
        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\讲义\\itheima\\code\\project_javaseup\\day_10\\src\\作业中需要的文件\\tangshi.txt"));
        //3、循环按行读取
        String input;
        while ((input = bufferedReader.readLine()) != null){
            //4、把读取到的当前行字符串反转后存储List集合对象中
            StringBuilder reverse = new StringBuilder(input).reverse();
            stack.add(reverse.toString());
        }

        //5、关闭流
        bufferedReader.close();
        //6、创建字符缓冲输出流对象,绑定目标文件
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\讲义\\itheima\\code\\project_javaseup\\day_10\\src\\作业中需要的文件\\tangshi反转.txt"));
        //7、倒着遍历List集合对象
        while (!stack.isEmpty()){
            //8、把当前行字符串写出到目标文件
            bufferedWriter.write(stack.pop());
            bufferedWriter.newLine();
        }
        //9、关闭资源
        bufferedWriter.close();
    }
}
