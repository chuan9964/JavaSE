package com.itheima.homework;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class Test02 {
    public static void main(String[] args) throws DocumentException {
        // 1、创建dom4j的核心类SAXReader对象
        SAXReader saxReader = new SAXReader();
        // 2、dom4j的核心类SAXReader对象调用read方法,把xml文件加载到内存,获取Document对象
        Document document = saxReader.read(new File("E:\\讲义\\itheima\\code\\project_javaseup\\day_11\\src\\com\\itheima\\homework\\hmDataSourceConfig.xml"));
        // 3、Document对象调用方法,获取根标签hmdatabase-config
        Element rootElement = document.getRootElement();
        // 4、获取根标签hmdatabase-config的属性datasourcename的值,类的全名称
        String datasourcename = rootElement.attributeValue("datasourcename");
        // 5、输出类名称
        System.out.println(datasourcename);
        // 6、获取根标签hmdatabase-config的所有子标签property,存储List集合
        List<Element> elements = rootElement.elements();
        // 7、遍历List集合
        for (Element element : elements) {
            // 7.1、获取当前property标签: propertyElement

            // 7.2、获取当前标签property的属性name的值
            String name = element.attributeValue("name");
            // 7.3、获取当前标签property的文本内容
            String text = element.getText();
            // 7.4、输出子标签属性值及文本
            System.out.println(name+","+text);
        }

    }
}
