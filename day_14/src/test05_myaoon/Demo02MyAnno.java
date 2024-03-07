package test05_myaoon;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author liuwc
 * @since 2024/02/29
 */
@SuppressWarnings("all")
@MyAnno(status = false, value = "abc")
public class Demo02MyAnno {

    @MyAnno(age = 28, status = true, value = "ac")
    public void show(){
        System.out.println("show");
    }

    /**
     * 1.自定义一个注解MyAnno；其中包含一些属性
     * 2.定义一个类，类里show方法上加MyAnno注解，并给属性赋值
     * 3.在类里写一个main方法， 判断show方法上有没有MyAnno注解；如果有，就获取配置的注解对象，并取参数值打印出来
     */
    @MyAnno("xxx")
    public static void main(String[] args) throws NoSuchMethodException {
        //要求：判断一下show方法上有没有MyAnno注解；如果有的话，就获取注解配置的属性参数值
        // 获取类的Class
        Class<Demo02MyAnno> clazz = Demo02MyAnno.class;
        // 从类的Class获取show方法的Method
        Method showMethod = clazz.getMethod("show");
        // 再调用Method对象的isAnnotationPresent方法，判断有没有MyAnno注解
        boolean b = showMethod.isAnnotationPresent(MyAnno.class);
        System.out.println("Demo02MyAnno类里的show方法上是否有@MyAnno注解：" + b);

        //就获取注解配置的属性参数值
        MyAnno myAnno = showMethod.getAnnotation(MyAnno.class);
        System.out.println(myAnno.age());
        System.out.println(myAnno.status());
        System.out.println(myAnno.value());

        System.out.println("------------------------");
        //@SuppressWarnings这个注解的功能，idea是怎么实现的？判断类上有没有@Suppresswarnings注解，如果有的话获取value值。根据value值不同，压制不同的警告
        boolean suppressWarnings = clazz.isAnnotationPresent(SuppressWarnings.class);
        System.out.println(suppressWarnings);
        if (suppressWarnings) {
            SuppressWarnings annotation = clazz.getAnnotation(SuppressWarnings.class);
            String[] value = annotation.value();
            System.out.println("要压制的警告有：" + Arrays.toString(value));
        }
    }
}
