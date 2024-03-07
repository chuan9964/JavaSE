package test02_reflect;

import org.junit.Test;

/**
 * @Author liuWeichuan
 * @Date 2024-02-29 11:06
 */

public class ReflectTest {

    @Test
    public void test01() {
        Student student = new Student();
        Class<? extends Student> aClass = student.getClass();
        System.out.println("aClass = " + aClass);
    }
    @Test
    public void test02() {
        Student student = new Student();
        Class<Student> studentClass = Student.class;
        System.out.println("studentClass = " + studentClass);
    }
    @Test
    public void test03() throws ClassNotFoundException {
        Student student = new Student();
        Class<?> aClass = Class.forName("test02_reflect.Student");
        System.out.println("aClass = " + aClass);
    }
}
