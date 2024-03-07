package com.itheima.streamdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo02 {
    /*
     学习Stream流的中间方法
     */
    public static void main(String[] args) {
        //将多个数据放到流水线上 形成新的Stream流
        Stream<String> stream1 = Stream.of("a", "b", "c", "d", "e", "f", "g");
        // limit(long n)流水线上取出前n个元素..形成一个新的流向  旧的流向已经关闭 (永不回头)
//        Stream<String> limit = stream1.limit(3);
        // forEach(写处理每个数据的lambda表达式)
        // lambda ()->{}
        System.out.println("=================limit 取前几个======================");
        stream1.limit(3).forEach(s-> System.out.println(s));

        // forEach() 终结方法 从流水线上下来了。
        //============================
        System.out.println("=================skip跳过======================");
        Stream<String> stream2 = Stream.of("a", "b", "c", "d", "e", "f", "g");
        //跳过
        stream2.skip(4).forEach(s -> System.out.println(s));

        System.out.println("=============distinct去重==========================");
        Stream<String> stream3 = Stream.of("a", "b", "a", "d", "b", "b", "g");
        //终结方法
//        System.out.println(stream3.count());
//        stream3.skip(3); 报错 原因 count()终结
        long count = stream3.distinct().count();
        System.out.println("去重之后还有几个数据:"+count);

        System.out.println("============sorted排序=================");
        Stream<Integer> stream4 = Stream.of(911,119,111,114,110);
        stream4.sorted().forEach(s-> System.out.println(s));//默认排序
        System.out.println("============sorted排序 自定义排序规则=================");
        Stream<Integer> stream5 = Stream.of(911,119,111,114,110);
        stream5.sorted((o1,o2)->o2-o1).forEach(s-> System.out.println(s));//默认排序


        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 16,154,1254,164,145,36,1554,256,265,346);
        Stream<Integer> stream6 = list.stream();
        System.out.println(stream6);
        stream6.filter(s->Math.pow(s,2)>600).forEach(System.out::println);

    }
}
