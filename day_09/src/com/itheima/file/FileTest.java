package com.itheima.file;

import java.io.File;

public class FileTest {
    /*
      从D盘中 找到 QQ.exe  找到后直接输出其位置
          找到D:盘 作为 搜索根路径。
          1:  D:盘 封装File对象
          2:  调用 listFile() --得到 D盘 下一级的所有文件和文件夹
          3:  遍历 --- 文件
                         判断 文件名是不是我们要找的  是 输出位置--结束
          4:  遍历 --- 文件夹
                    重复---2的动作
          此案例 可以通过 while循环做
                可以通过 递归做
          今天按照递归做
               递归  方法自己调用自己

               需要定义一个方法 方法里面完成 2-4步骤
                  参数:    一个文件夹 File对象  File dir
                           一个是被找 文件的名字
                  返回值： 不需要  找到就结束
                        找不到 继续找 继续调用该方法
     */
    public static void main(String[] args) {
        //先封装查找的 父路径
        File dir = new File("C:\\");
//        searchFile(dir,"QQ.exe");
        searchFile(dir,"WeChat.exe");
    }
    /**
     * 设计一个  去指定目录查找指定文件的方法。
     *   参数:
     *       指定目录  File dir
     *       指定文件名 String fileName
     *   返回值 void 找到打印
     */
    public static void searchFile(File dir , String fileName){

        // dir是一个目录--获取该目录下的 文件和文件夹
        File[] files = dir.listFiles();
        //遍历  先做非空的判断.
        if(files!=null && files.length>=0){
            for (File file : files) {
                //在一个个判断
                // 分支-- 文件一种玩法   文件夹一种玩法
                // 如果是文件判断 文件名是不是  fileName   == equals() 比较  contains()包含
                // 如果是文件夹 再次进行 查找 调用 searchFile(当前的文件夹,文件名)
                if(file.isFile()){
                    //是文件
                    if(file.getName().contains(fileName)){
                        //执行到这里 说明 找到了
                        System.out.println(fileName+"文件在这里:"+file.getAbsolutePath());
                        return;// System.exit();

                    }
                }else{//是文件夹  file是一个子文件夹
                     // 继续进行查找
                    searchFile(file,fileName);//递归调用
                }
            }
        }

    }

    /*
     //遍历 空目录...
        if(files==null && files.length==0){//没有遍历的必要
            return;//结束
        }
        for (File file : files) {

        }

        if(files!=null && files.length>=0){
            for (File file : files) {
                //在一个个判断
            }
        }


     */


}
