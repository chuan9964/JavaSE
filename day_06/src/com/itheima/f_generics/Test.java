package com.itheima.f_generics;

import java.util.ArrayList;

/*
 定义几个类
 */
class Car extends Object{}
class BENZ extends Car{}
class ThreeBengZi extends Car{}


public class Test {

    public static void main(String[] args) {

        ArrayList<BENZ> list1 = new ArrayList<>();
        ArrayList<ThreeBengZi> list2 = new ArrayList<>();
        ArrayList<Car> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();
        test1(list1);
        test1(list2);
        test1(list3);
        test1(list4);
        test2(list1);
        test2(list2);
        test2(list3);
        test2(list4);
        System.out.println("===================");
        System.out.println("=  只能车及其子类 可以接收========");
        test3(list1);//   ArrayList<BENZ> list1 = new ArrayList<>();
        test3(list2);//   ArrayList<ThreeBengZi> list2 = new ArrayList<>();
        test3(list3);//   ArrayList<Car> list3 = new ArrayList<>();
        //   ArrayList<Car> list3 =  new ArrayList<Car>();
        //  如果类型有泛型  类型<泛型>  整体是一个类型!!
        //  List<Car>  ArrayList<Car>
//        test3(list4);
        // <? extends Car> 泛型的类型是Car或及其子类!
        // <? super Car>   泛型的类型是Car或及其父类!
        System.out.println("=  只能车及其父类 可以接收========");
//        test4(list1);
//        test4(list2);
        test4(list3);
        test4(list4);

    }
    /*
      设计一个方法 可以接收 各种各样的集合
     */
    public static <T> void test1(ArrayList<T> list){
        System.out.println("测试");
    }
    /*
      ? 通配符接收带有泛型集合
     */
    public static  void test2(ArrayList<?> list){
        System.out.println("测试");
    }

    public static  void test3(ArrayList<? extends Car> list){
        System.out.println("限制泛型的类型!!!!!");
    }

    public static  void test4(ArrayList<? super Car> list){
        System.out.println("限制泛型的类型!!!!!");
    }
}
