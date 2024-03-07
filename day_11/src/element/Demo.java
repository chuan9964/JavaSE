package element;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Demo {
    /*
      学习如何使用DOM4J技术解析xml文件


          以后我们如果用别的依赖jar包，就遵循别人提供的方式去玩 DOM4J！


     */
    public static void main(String[] args) throws Exception{
       /*
         如何获取根元素
           1:创建DOM4J 核心读取对象 SAXReader()
           2:调用 read(被解析xml文件位置)方法 得到文档对象(一棵树)
           3:文档调用 getRootElement方法得到 根元素
           元素类型 Element
        */
        //1:创建DOM4J 核心读取对象 SAXReader()
        SAXReader saxReader = new SAXReader();
        //2:调用 read(被解析xml文件位置)方法 得到文档对象(一棵树)
        Document document = saxReader.read("day_11\\src\\helloworld.xml");
        // document 树
        //3:文档调用 getRootElement方法得到 根元素
        Element rootElement = document.getRootElement();
        System.out.println(rootElement);
        System.out.println(rootElement.getName());
        /*
          Element方法学习
             getName() 获取当前元素的名字
             List<Element> elements() 获取当前元素(标签)的所有子元素
             List<Element> elements(String childName) 获取当前元素(标签)的指定名称的子元素

         */
        // 4:获取 根元素下所有的子元素标签
//        List<Element> elements = rootElement.elements();//elements 根元素下的所有的子元素
        List<Element> elements = rootElement.elements("user");//elements 根元素下的所有的子元素
        System.out.println(elements.size());
        // 循环得到 每一个子元素标签
        for (Element element : elements) {
            System.out.println(element.getName());
        }

        System.out.println("======================");
        //根据名字  获取 people标签
        Element peopleE = rootElement.element("people");
        System.out.println("元素名字:"+peopleE.getName());
        //获取标签文本信息
        System.out.println("people元素的文本信息:"+peopleE.getText());

        // 根据名字  获取 user标签 如果获取单个 是第一个
        Element userE = rootElement.element("user");
        //  attributeValue(属性名)
        System.out.println("userE属性id:"+userE.attributeValue("id"));
        System.out.println("userE属性desc:"+userE.attributeValue("desc"));
        // 请解析出  userE 中 子标签的 的文本信息
//          userE.element("name").getText()
               //获取 userE 的name标签 的 文本信息
        // 获取指定子标签的文本信息
        System.out.println(userE.elementText("name"));
        System.out.println(userE.elementText("sex"));
        System.out.println(userE.elementText("地址"));
        System.out.println(userE.elementText("password"));
        System.out.println(userE.elementText("data"));
        System.out.println(userE.elementText("data1"));


    }
}
