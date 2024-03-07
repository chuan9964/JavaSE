package test03_method;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * 调用一个对象的方法，有两种方式，最终效果相同：
 *  普通方式：Object res = 对象.方法名(实参列表);
 *  反射方式：
 *      1. 先获取类的Class
 *      2. 从Class里获取普通方法对应的Method
 *          clazz.getMethods()：获取所有public方法
 *          clazz.getDeclaredMethod()：获取所有方法
 *          clazz.getMethod(String name, Class... parameterTypes)：获取指定public方法
 *          clazz.getDeclaredMethod(String name, Class... parameterTypes)
 *      3. 反射调用Method，传入方法的实参，得到方法的返回值
 *          Object res = method.invoke(对象, 实参列表)
 * @author liuyp
 * @since 2024/02/29
 */
public class Demo03Method {

    /**
     * 反射调用public方法:Student的eat方法
     */
    @Test
    public void test1() throws Exception {
        Student student = new Student();
        student.eat("爆肚面");
        System.out.println("----------------");

        //1. 获取Class
        Class<Student> studentClass = Student.class;
        //2. 获取Method：获取名称为eat，第一个形参是String的方法
        Method eat = studentClass.getMethod("eat", String.class);
        //3. 调用Method：method.invoke(对象, 实参列表)
        Object invoke = eat.invoke(student,"炸鸡");
        System.out.println(invoke);


    }

    /**
     * 反射调用private方法：sleep
     */
    @Test
    public void test2() throws Exception {
        Student s = new Student();

        //1. 获取Class
        Class<? extends Student> clazz = s.getClass();
        //2. 获取Method
        Method sleepMethod = clazz.getDeclaredMethod("sleep", int.class);
        //3. 设置允许暴力反射
        sleepMethod.setAccessible(true);
        //4. 反射调用Method
        Object res = sleepMethod.invoke(s, 8);
        System.out.println("res = " + res);
    }
}
