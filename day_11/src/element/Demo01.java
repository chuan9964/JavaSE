package element;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Demo01 {

    public static void main(String[] args) throws DocumentException {
        // 1:创建DOM4J 核心读取对象 SAXReader()
        SAXReader saxReader = new SAXReader();
        // 2:调用 read(被解析xml文件位置)方法 得到文档对象(一棵树)
        Document document = saxReader.read("day_11\\src\\helloworld.xml");
        // //3:文档调用 getRootElement方法得到 根元素
        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());
        /*
          Element方法学习
             getName() 获取当前元素的名字
             List<Element> elements() 获取当前元素(标签)的所有子元素
             List<Element> elements(String childName) 获取当前元素(标签)的指定名称的子元素

         */
        // 4:获取 根元素下所有的子元素标签
        List<Element> elements = rootElement.elements("user");
        System.out.println(elements.size());

        // 循环获得 每一个子元素
        for (Element element : elements) {
            System.out.println(element.getName());
        }

        // 根据名字 获取people标签
        Element peopleE = rootElement.element("people");
        System.out.println("元素名字："+peopleE.getName());

        // 获取标签文本信息
        String peopleEText = peopleE.getText();
        System.out.println("people文本信息："+peopleEText);

        // 根据名字 获取user标签
        Element user = rootElement.element("user");

        System.out.println(user.getName());
        System.out.println(user.attributeValue("id"));
        System.out.println(user.attributeValue("desc"));
        System.out.println(user.getData());
        System.out.println(user.attributeValue("desc"));

    }
}
