package test06;

/**
 * @author liuyp
 * @since 2024/02/29
 */
public class DemoMyTest {
    @MyTest
    public void test1(){
        System.out.println("test1");
    }

    public void test2(){
        System.out.println("test2");
    }

    @MyTest
    public void test3(){
        System.out.println("test3");
    }
}
