package com.itheima.e_lambda;

public class Test {

    public static void main(String[] args) {

        /*
         匿名内部类--本质是子类对象
         */
        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("朕在游泳....好多泡泡....");
            }
        });
        System.out.println("=========================");
        /*
          如果 一个方法的参数 是一个接口类型---可以使用匿名内部类完成调用
                             这个接口里面有且只有一个抽象方法 可以使用Lambda进行简化。
               JDK8之后  函数式接口---有且只有一个抽象方法的接口。
                       出了 一个标注函数式接口的注解 @FunctionalInterface
              lambda使用  目的 简化代码 接口名 方法名 修饰符 返回值类型 不重要的简化  参数 方法体 不去简化
                 前提
                    用于替换  函数式接口的 匿名内部类对象
                 格式
                     一些参数  一个箭头  一段代码
                    (方法参数列表)->{方法体}
         */
        //  使用lambda 完整格式
        goSwimming(
           ()->{
                System.out.println("朕在游泳....好多美女....");
            }
        );
        System.out.println("下面是简化");

        goSwimming(()-> System.out.println("朕在游泳....好多猛男...."));
    }

    /*
     去游泳的方法
      跟 会游泳的 游泳
     */
    public static void goSwimming(Swimming swimming){//传递的游泳接口--只要是它的子类对象 肯定会游泳
        swimming.swim();
    }
}
