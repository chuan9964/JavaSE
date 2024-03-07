package test01_Junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author liuWeichuan
 * @Date 2024-02-29 9:51
 */

public class MathUnitTest {

    @Before
    public void before(){
        System.out.println("==before==");
    }

    @After
    public void after(){
        System.out.println("==after==");
    }

    @Test
    public void test_getMax1(){
        int max = MathUnit.getMax(5, 90);
        Assert.assertEquals(max, 90);
    }

    @Test
    public void test_getMax2(){
        int max = MathUnit.getMax(4, 90);
        Assert.assertEquals(max, 90);
    }
    @Test
    public void test_getMax3(){
        int max = MathUnit.getMax(400, 90);
        Assert.assertEquals(max, 90);
    }
}
