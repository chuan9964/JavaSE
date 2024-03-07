package test06;

import java.lang.reflect.Method;

/**
 * @author liuyp
 * @since 2024/02/29
 */
public class MyTestParser {
    /**
     * 要求：DemoMyTest类里，哪个方法上有@MyTest注解，就运行一次这个方法；如果没有，就忽略不运行
     * 分析：
     *      获取类里所有的方法：用反射
     *      循环遍历每个方法：
     *          如果方法上有@MyTest注解，就执行一次这个方法
     */
    public static void main(String[] args) throws Exception {
        DemoMyTest demo = new DemoMyTest();

        //1. 获取DemoMyTest里所有的方法
        Class<DemoMyTest> clazz = DemoMyTest.class;
        Method[] methods = clazz.getMethods();
        //2. 循环遍历每个方法
        for (Method method : methods) {
            //判断方法上有没有MyTest注解
            boolean b = method.isAnnotationPresent(MyTest.class);
            if (b) {
                //存在这个注解，执行一次这个方法
                method.invoke(demo);
            }
        }
    }
}
