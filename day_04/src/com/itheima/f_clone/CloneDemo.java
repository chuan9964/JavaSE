package com.itheima.f_clone;

public class CloneDemo {
  /*
       如何完成对象克隆
         1:javabean类 实现 Cloneable接口。
         2:javabean重写clone方法。
         3:在测试类调用 注意需要抛出一个异常。
         4:调用完成就得到一个克隆出来的对象

     这种克隆称为 浅克隆
           新建了一份空间
              把上一份空间
                 基本类型 -- 数据值复值过来了
                 引用类型 -- 地址值复制过来了
            浅克隆 克隆出来 所有的数据都一模一样(引用属性 地址一样的)
            不是特别的好！！！

            深克隆
                基本类型 -- 数值复制
                字符串  -- 地址复制
                引用类型  -- 不再地址复制  创建新的对象  -- 再用一次克隆
   */
    public static void main(String[] args) throws CloneNotSupportedException {
                                                 //提前告诉你 你这里可能出问题

        double[] scores = {100,50,0};
        User u1 = new User("9527","华安","qiuxiang",scores);

//        User u2 = u1;
        //两个对象指向同一个地址不是克隆
        //克隆出来之后 内容一样 但是 地址不一样！
        // protected 受保护的  本类  子类中
        User u2 = (User) u1.clone();//默认是Object类型接收 强转

        System.out.println(u1==u2);//地址不相等
        System.out.println("查看u1中的属性:");
        System.out.println(u1.getId());
        System.out.println(u1.getUsername());
        System.out.println(u1.getPassword());
        System.out.println(u1.getScores());
        System.out.println("==============");
        System.out.println("查看u2中的属性:");
        System.out.println(u2.getId());
        System.out.println(u2.getUsername());
        System.out.println(u2.getPassword());
        System.out.println(u2.getScores());

    }
}
