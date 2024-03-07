package com.itheima.interface02;


public class Test {

    /*
      接口:在Java编程语言中是一种特殊的类型,比抽象类更抽象。
      定义接口:
        public interface 接口名{
           常量;
           jdk8之前里面只有抽象方法;
        }
      定义接口的目的是为了让 类 去实现，这样类就具备了 接口的定义的规则。
      接口可以理解为是具备一种规则的规范。
      类如何实现接口？
         public class 实现类 implements 接口{
              需要重写所有的抽象方法。 如果没有重写完 就必须是抽象类

         }
         接口的好处
            可以在继承一个类的基础上 实现多个接口。---提升类型扩展性
            让程序可以面向接口编程(参数是一个接口),程序员方便各种业务的切换。

      假设有个类型叫Student类型
          还有 一个 司机的接口    drive()  stopCar()
               一个 Singer 歌手的接口  sing()

           设计一个类
              XiaoHan  是一个学生  偶尔去开车  还去 KTV 唱歌

     */

    public static void main(String[] args) {

        XiaoHan xh = new XiaoHan();

        needDriver(xh);//因为多态!!  Driver driver= new XiaoHan();

        needSingger(xh);

        Driver driver= new XiaoHan();
        needDriver(driver);
    }

    public static void needDriver(Driver driver){//接口作为参数  你只要传递 实现该接口的对象就可以
        driver.drive();
    }

    public static void needSingger(Singger singger){
        singger.sing();
    }
}
