package com.itheima;

import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

    /*
    掌握
       使用Properties集合类去读取属性文件中的键值对信息并完成解析。

      .properties结尾的文件 叫 属性文件 也叫配置文件。
        里面存储数据的特点
           1：键值对形式
           2: 键不重复
           3: 文件后缀名是.properties
        文件在开发中是来存储   配置信息的。比如 连接数据库的用户名密码等...

       在开发中是怎么去读取这种文件呢？
          因为键值对的 所以Java提供了一个类型 Properties去专门去完成这类文件信息的存储(读取)
          Properties是Map的集合一个子类。
            特殊的子类---里面设定了  一个 读取  和  写出  properties文件的功能
     */
    public static void main(String[] args) throws Exception{
           //1:创建Properties对象 (键值对)
        Properties pp  = new Properties();
        System.out.println(pp);
        // 2: 使用load(输入流)功能，可以将流关联的文件中的 属性集信息 读取到 Properties中
        pp.load(new FileReader("day_11\\src\\user.properties"));
        System.out.println(pp);


        //3:数据都读取到 pp集合中
        //获取键集
        //Set<Object> objects = pp.keySet();//使用父亲的方法 键的泛型是 Object
        Set<String> keys = pp.stringPropertyNames();//获取 键值对中所有的键  属性集中 属性的名字
        for (String key : keys) {
            //key 所有的键--- 属性的名字
            //    键对应的值  属性的值
//            Object o = pp.get(key);//使用父亲的方法 得到键是Object
           //  优化了一个方法
            String value = pp.getProperty(key);
            System.out.println(key+":"+value);
        }
        System.out.println("========================foreach遍历======");
        pp.forEach((k,v)-> System.out.println(k+":"+v));
    }
}
