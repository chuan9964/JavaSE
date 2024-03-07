package com.itheima.e_lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Demo02 {

    public static void main(String[] args) {
        Person[] peoples = new Person[4];
        Person p1 = new Person("恐龙扛狼", 24);
        Person p2 = new Person("补录biu", 18);
        Person p3 = new Person("芝士雪豹", 26);
        Person p4 = new Person("丁真珍珠", 17);

        peoples[0] = p1;
        peoples[1] = p2;
        peoples[2] = p3;
        peoples[3] = p4;

        //按照 年龄 进行降序
//        Arrays.sort(peoples, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o2.getAge()-o1.getAge();
//            }
//        });
       //使用lambda 完整格式
//        Arrays.sort(peoples,(Person o1,Person o2)->{return o2.getAge()-o1.getAge();});
        //使用lambda 简化格式
        Arrays.sort(peoples,( o1, o2)-> o2.getAge()-o1.getAge());

        System.out.println("数组排序后效果:"+Arrays.toString(peoples));
    }
}
