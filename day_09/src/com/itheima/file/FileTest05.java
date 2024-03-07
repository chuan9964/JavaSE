package com.itheima.file;

import java.io.File;
import java.io.IOException;

public class FileTest05 {
    /*
      目标：
         理解 文件(夹)  创建和删除
     */
    public static void main(String[] args) throws IOException {
        //在 E:\418\download  创建一个文件 abc.txt
        // 先创建一个带有路径File对象
        File file = new File("E:\\418\\download\\abc.txt");//路径写要创建文件的路径
        //file 不是真实存在的
        //创建文件  createNewFile()
        boolean flag1 = file.createNewFile();//爆红是因为 当前叫编译期异常--跟外界因素
                            // 写的路径 目录是真的吗？不一定 外界因素  有没有权限呀？
        System.out.println("文件是否创建成功了:"+flag1);
        // 第一次执行 结果 true  已经有了 就是false

        // 在 E:\418\download  创建一个文件夹   418学生档案  一层目录
        // 先创建带有 路径的 File对象
        File dir = new File("E:\\418\\download\\418学生档案");
        //创建文件夹  mkdir()
        System.out.println("文件夹是否创建成功:"+dir.mkdir());//创建单级目录

        // 在 E:\418\download  创建一个文件夹   418组长\刘靖轩  两层目录
        File dir2 = new File("E:\\418\\download\\418组长\\刘靖轩");
        System.out.println("创建多层目录:"+dir2.mkdirs());//创建多级目录

        // 删除文件(夹)  delete
        System.out.println(file.delete());//不走回收站 慎用
        System.out.println(dir.delete());//删除单级
        System.out.println(dir2.delete());//删除多级--其实是单级的

        File dirs = new File("E:\\418\\download\\搞笑");
        System.out.println(dirs.delete());
        // 注意 delete不能删除 非空文件夹
    }
}
