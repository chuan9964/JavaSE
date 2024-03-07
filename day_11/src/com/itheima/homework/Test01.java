package com.itheima.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) throws IOException {
        // 1、创建properties集合对象
        Properties properties = new Properties();
        // 2、把配置文件中的内容加载到Properties对象中
        properties.load(new FileReader("E:\\讲义\\itheima\\code\\project_javaseup\\day_11\\src\\fuhao.txt"));
        // 3、获取所有的富豪名字
        Set<String> propertyNames = properties.stringPropertyNames();
        // 4、找到王卫 并修改
        for (String propertyName : propertyNames) {
            if (propertyName .equals("王卫")){
                properties.setProperty(propertyName,"1860亿");
            }
        }
        // 5、把更新后的Properties中的内容写入到文件
        properties.store(new FileWriter("E:\\讲义\\itheima\\code\\project_javaseup\\day_11\\src\\newfuhao.txt"),"这是更改之后的数据");
    }
}
