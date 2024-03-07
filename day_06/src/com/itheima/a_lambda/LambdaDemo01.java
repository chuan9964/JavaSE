package com.itheima.a_lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo01 {

    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0]  = new Person("小诸葛刘能",58);
        persons[1]  = new Person("尼古拉斯赵四",55);
        persons[2]  = new Person("作妖老王谢广坤",60);
        persons[3]  = new Person("铁锹战神王老七",53);

        // 按照 年龄进行排序  升序
//        Arrays.sort(persons, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return 0;
//            }
//        });

        //Arrays.sort(persons, (o1,o2)->{return o1.getAge()-o2.getAge();});

//        Arrays.sort(persons, (o1,o2)->o1.getAge()-o2.getAge());

        // lambda中  实现方法  去通过别的类的静态方法实现
//        Arrays.sort(persons, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return CompareByData.compareByAge(o1,o2);
//            }
//        });

//        Arrays.sort(persons, (o1,o2)-> CompareByData.compareByAge(o1,o2));
        Arrays.sort(persons, CompareByData::compareByAge);
        /*
    静态方法引用格式
          类名::方法名
          前提
            1:lambda里面只调用一个静态方法。
            2:前后参数一致
         */


        Arrays.sort(persons, CompareByData::compareByAge);
          /*
          实例方法引用格式
              对象名::实例方法名
            前提:
               1:lambda 里面只调用了实例方法
               2:前后参数一致
         */

        System.out.println(Arrays.toString(persons));


    }
}
