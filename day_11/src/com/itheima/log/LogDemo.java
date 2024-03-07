package com.itheima.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDemo {

    //日志对象 写在成员位置
    //创建一个日志对象 --不能被更改的对象--final static
    public static final Logger LOGGER = LoggerFactory.getLogger("LogDemo");
    // 每个日志 都是为一个java文件服务           工厂提供日志对象

    public static void main(String[] args) {

        try{
            LOGGER.info("除法方法即将被调用");
            chufa(2,0);
            LOGGER.info("除法方法调用完毕");
        }catch (Exception e){
            LOGGER.info("除法方法出现异常了");
        }


    }

    public static int chufa(int a,int b){
        // 记录第一个参数
        LOGGER.info("第一个参数:"+a);
        // 记录第二个参数
        LOGGER.info("第二个参数:"+b);
        int c = a/b;
        LOGGER.info("执行结果:"+c);
        //执行除法
        return c;
    }


}
