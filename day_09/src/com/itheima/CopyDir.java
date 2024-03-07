package com.itheima;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyDir {


    public static void main(String[] args) throws Exception {
        //测试
        File srcDir = new File("E:\\418\\code\\day09\\aaa");
        File destDir = new File("E:\\418\\code\\day09\\bbb");

        copyDir(srcDir,destDir);
    }

    /**
     *  拷贝文件
     * @param srcFile 源文件
     * @param destDir 目标文件夹
     */
    public static void copyFile(File srcFile,File destDir) throws Exception{
        // 1:创建字节输入流 关联  源文件
        FileInputStream in = new FileInputStream(srcFile);
        // 2:创建字节输出流 关联 目标文件
//        new FileOutputStream(destDir)  destDir是文件夹
        FileOutputStream out = new FileOutputStream(destDir.getAbsolutePath()+"\\"+srcFile.getName());
                                                          //  目标文件夹路径   \\ 复制后文件的名字

        byte[] buffer = new byte[1024*8];
        int len;//用来接收读取字节个数的 一个变量  因为它如果是-1读到末尾了
        // 3:读取源文件数据到内存    buffer 真实个数len 从0 数len个 是读到的源数据
        while((len = in.read(buffer))!=-1){
            // 4:将内存数据写到目标文件
            out.write(buffer,0,len);
        }

        // 5:释放资源
        out.close();
        in.close();
    }

    /*
     拷贝文件夹
         将 源文件夹 srcDir 中 所有的内容 都拷贝 到 destDir下面
          步骤
             1:获取源文件夹的 子文件夹和子文件
             2:判断是不是空的文件夹--空文件夹 没必要复制
             3:遍历 子文件夹和子文件
             4:判断如果是子文件---调用方法将 源文件 复制到目标文件夹中。
             5:判断如果是子文件夹--创建新的同名文件夹(目标目录下)  调用复制文件夹方法--递归。
     */

    /**
     * 拷贝 文件夹
     * @param srcDir  源文件夹
     * @param destDir 目标文件夹
     */
    public static void copyDir(File srcDir,File destDir) throws Exception {
//        1:获取源文件夹的 子文件夹和子文件
        File[] files = srcDir.listFiles();
//        2:判断是不是空的文件夹--空文件夹 没必要复制
          if(files==null || files.length==0){
              return;
          }
//        3:遍历 子文件夹和子文件
        for (File f : files) {
            if(f.isFile()){  //  4:判断如果是子文件---调用方法将 源文件 复制到目标文件夹中。
                copyFile(f,destDir);
            }else { //   5:判断如果是子文件夹--创建新的同名文件夹(目标目录下)  调用复制文件夹方法--递归
                File newDir = new File(destDir,f.getName());
                newDir.mkdir();
                // 调用本身复制文件夹
                copyDir(f,newDir);
            }


        }

    }

}
