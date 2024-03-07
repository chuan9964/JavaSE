package com.itheima.demo01;

public class Test {
    public static void main(String[] args) {
        //5、main方法内部调用fun方法,传递匿名内部类对象
        fun(new JumpAble() {
            @Override
            public void jump() {
                System.out.println("5.main方法内部调用fun方法,传递匿名内部类对象");
            }
        });
        //6、main方法内部调用fun方法,传递lambda表达式标准格式
        fun(()->{
            System.out.println("6.main方法内部调用fun方法,传递lambda表达式标准格式");
        });

        //7、main方法内部调用fun方法,传递lambda表达式简化格式
        fun(()->
            System.out.println("7.main方法内部调用fun方法,传递lambda表达式简化格式")
        );

    }

    private static void fun(JumpAble jumpAble) {
        //4、fun方法内部调用JumpAble接口的抽象方法jump
        jumpAble.jump();
    }
}
