package homework.reflect.context;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ClasspathApplicationContext implements ApplicationContext {

    // 定义一个容器存储系统中可能使用到的对象
    private ConcurrentHashMap<String , Object> beans = new ConcurrentHashMap<>();

    // 定义构造方法
    public ClasspathApplicationContext(String fileName) throws Exception {

        // 补全代码
        // 创建properties对象 并 加载文件
        Properties properties = new Properties();
        properties.load(new FileReader(fileName));
        // 生成set集合 遍历所有的文件信息
        Set<String> strings = properties.stringPropertyNames();
        for (String key : strings) {
            // key是读出的键 这里只用 value值，使用getProperty(key)
            // 1.获取Class对象(完全限定名方式)

            Class<?> aClass = Class.forName(properties.getProperty(key));
            // 2.获取对象构造方法
            Constructor<?> constructor = aClass.getConstructor();
            // 3.调用构造方法
            Object o = constructor.newInstance();
            beans.put(key, o);
        }
    }

    @Override
    public <T> T getBean(Class<T> clazz) {

        // 补全代码
        // 遍历map集合找到指定class返回
        for (String key : beans.keySet()) {
            Object value = beans.get(key);
            if (value.getClass() == clazz){
                return (T) value;
            }
        }

        return null;
    }

}
