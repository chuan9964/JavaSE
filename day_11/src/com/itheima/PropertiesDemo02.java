package com.itheima;

import java.io.FileWriter;
import java.util.Properties;

public class PropertiesDemo02 {
    /*
     目标
       掌握使用Properties 将集合数据写到一个 属性集文件中。

     */
    public static void main(String[] args) throws Exception{
        //1:创建Properties对象  存储一些键值对数据。
        Properties pp = new Properties();
        // 可以使用父亲方法  可以用 但是不够精准
//        pp.put("",new Object());
        // 存都是字符串  自己 优化了方法  pp.setProperty(字符串键,字符串值)设置属性集
        pp.setProperty("李亚雷","张冠电");
        pp.setProperty("郭家琪","盆国歪");
        pp.setProperty("王振魁","卒衰瘦");
        //2:调用 store()功能 将集合数据写到指定文件中.
        pp.store(new FileWriter("day_11\\src\\user2.properties"),"xxxxxxx this is fanyici");

    }
}
