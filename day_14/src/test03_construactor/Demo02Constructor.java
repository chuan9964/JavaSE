package test03_construactor;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * 构造方法：用于创建类的实例对象的
 * 调用构造方法的方式有两种：
 *  普通方式：new 构造方法名(实参列表)
 *  反射方式：
 *      1. 先获取类的Class
 *      2. 从Class里获取构造方法对应的Constructor
 *          clazz.getConstructors()：得到Constructor[]，获取类里所有的public构造方法
 *          clazz.getDeclaredConstructors()：得到Constructor[]，获取类里所有的构造方法
 *          clazz.getConstructor(Class... parameterTypes)：根据形参类型，找到对应的public构造方法
 *          clazz.getDeclaredConstructor(Class... parameterTypes)：根据形参类型，找到对应的构造方法
 *      3. 调用Constructor的方法，就会生成类的实例对象
 *          constructor.newInstance(Object... args)：调用构造方法并传入构造参数，得到生成的实例对象
 *          constructor.setAccessible(boolean flag)：设置一下，是否允许暴力反射调用
 * @author liuyp
 * @since 2024/02/29
 */
public class Demo02Constructor {
    /**
     * 获取一批构造方法
     */
    @Test
    public void testGetConstructors(){
        //1. 先获取类的Class
        Class<Student> studentClass = Student.class;
        //2. 获取所有public构造方法
        // Constructor<?>[] constructors = clazz.getConstructors();
        Constructor<?>[] constructors = studentClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("constructor = " + constructor);
        }
    }

    @Test
    public void testGetConstructor() throws NoSuchMethodException {
        //1. 先获取类的Class
        Class<Student> studentClass = Student.class;

        //2. 获取无参的构造方法
        Constructor<Student> constructor = studentClass.getConstructor();
        System.out.println("constructor = " + constructor);
        //3. 获取全参构造方法：
        // 是private的，所以要使用getDeclaredConstructor方法
        // 如果要获取有参的构造方法，需要getDeclaredConstructor传入 构造方法的形参类型列表
        //   要查找第一个形参是String类型的，第二个形参是Integer类型的 构造方法

        Constructor<Student> declaredConstructor = studentClass.getDeclaredConstructor();
        System.out.println("declaredConstructor = " + declaredConstructor);

        Constructor<Student> declaredConstructor1 = studentClass.getDeclaredConstructor(String.class, Integer.class);
        System.out.println("declaredConstructor1 = " + declaredConstructor1);
    }

    @Test
    public void testNewInstance1() throws Exception {
        //1. 获取类的Class
        Class<Student> clazz = Student.class;
        //2. 获取无参构造方法
        Constructor<Student> constructor = clazz.getConstructor();
        //3. 调用无参构造，得到实例对象
        Student student = constructor.newInstance();
        System.out.println("student = " + student);

    }

    @Test
    public void testNewInstance2() throws Exception {
        //1. 获取类的Class
        Class<Student> clazz = Student.class;
        //2. 获取有参构造方法
        Constructor<Student> constructor = clazz.getDeclaredConstructor(String.class, Integer.class);
        //3. 因为是private的，所以需要暴力反射
        constructor.setAccessible(true);
        //4. 调用无参构造，得到实例对象
        Student constructordc = constructor.newInstance("刘伟传", 18);
        System.out.println("constructordc = " + constructordc);

    }
}
