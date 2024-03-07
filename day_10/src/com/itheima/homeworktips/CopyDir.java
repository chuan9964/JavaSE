package com.itheima.homeworktips;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class CopyDir {

    static String joinDir = "day09";


    static ArrayList<String> students =new ArrayList<>(Arrays.stream(
            new String[] {"曹旭阳", "洪嘉祥", "李翔杰", "刘伟传", "朱科莹", "潘健", "齐浩添", "叶玉义"}
    ).toList());


    public static void main(String[] args) throws Exception {
        getHomeworkZip();
    }

    private static void getHomeworkZip() throws Exception {
        File destDir = new File("C:\\Users\\Public\\Nwt\\cache\\recv\\"+joinDir);
        destDir.mkdirs();
        for (String stuDir : students) {
            File srcDir = new File("C:\\Users\\Public\\Nwt\\cache\\recv\\");
            copyDir(srcDir, destDir);
            System.out.println("已复制："+srcDir.getAbsolutePath()+"\\"+stuDir);
        }

    }

    /**
     * 拷贝文件
     *
     * @param srcFile 源文件
     * @param destDir 目标文件夹
     */
    public static void copyFile(File srcFile, File destDir) throws Exception {
        // 1:创建字节输入流 关联  源文件
        FileInputStream in = new FileInputStream(srcFile);
        // 2:创建字节输出流 关联 目标文件
//        new FileOutputStream(destDir)  destDir是文件夹
        var destFile = destDir.getAbsolutePath() + "\\" + srcFile.getName();
        FileOutputStream out = new FileOutputStream(destFile);


        byte[] buffer = new byte[1024 * 8];
        int len;//用来接收读取字节个数的 一个变量  因为它如果是-1读到末尾了
        // 3:读取源文件数据到内存    buffer 真实个数len 从0 数len个 是读到的源数据
        while ((len = in.read(buffer)) != -1) {
            // 4:将内存数据写到目标文件
            out.write(buffer, 0, len);
        }
        // System.out.println("复制文件：" + destFile);
        // 5:释放资源
        out.close();
        in.close();
        // 删除源文件
        srcFile.delete();
    }

    /**
     * 拷贝 文件夹
     *
     * @param srcDir  源文件夹
     * @param destDir 目标文件夹
     */
    public static void copyDir(File srcDir, File destDir) throws Exception {
//        1:获取源文件夹的 子文件夹和子文件
        File[] files = srcDir.listFiles();
//        2:判断是不是空的文件夹--空文件夹 没必要复制
        if (files == null || files.length == 0) {
            return;
        }
//        3:遍历 子文件夹和子文件
        for (File f : files) {
            if (f.isFile()) {  //  4:判断如果是子文件---调用方法将 源文件 复制到目标文件夹中。
                copyFile(f, destDir);
            }else if(!students.contains(f.getName())){
                continue;
            } else { //   5:判断如果是子文件夹--创建新的同名文件夹(目标目录下)  调用复制文件夹方法--递归
                File newDir = new File(destDir, f.getName());
                newDir.mkdir();
                // System.out.println("创建文件夹：" + newDir.getAbsolutePath());
                // 调用本身复制文件夹
                copyDir(f, newDir);
            }
        }

    }

}
