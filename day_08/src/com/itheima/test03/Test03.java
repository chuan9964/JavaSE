package com.itheima.test03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test03 {
    public static void main(String[] args) {
        // 第一个队伍数据
        List<String> one = new ArrayList<>();
        one.add("JavaEE418,何洁,95");
        one.add("JavaEE418,杨坤,60");
        one.add("JavaEE418,迪丽热巴,85");
        one.add("JavaEE418,凤凰传奇,95");
        one.add("JavaEE418,刘德华,50");
        one.add("JavaEE418,乌兰图雅,50");
        one.add("JavaEE418,筷子兄弟,90");
        // 第二个队伍数据
        List<String> two = new ArrayList<>();
        two.add("JavaEE418,胡静,96");
        two.add("JavaEE418,贾静雯,62");
        two.add("JavaEE418,伊能静,87");
        two.add("JavaEE418,张静初,97");
        two.add("JavaEE418,蒋林静,52");
        two.add("JavaEE418,张一山,90");
        two.add("JavaEE418,胡一天,83");

        // 获取第一个队伍的Stream流对象
        Stream<String> stream1 = one.stream();
        // 1.第一个队伍根据字符串内容转换成对应的Student对象
        Stream<Student> studentStream1 = stream1.map(Student::new);
        // 2.第一个队伍筛选之后不要前2个人；
        Stream<Student> result1 = studentStream1.skip(2)
                // 3.第一个队伍只要名字为4个字的成员；
                .filter(s -> s.getName().length() == 4)
                // 4.第一个队伍只要成绩及格的成员；
                .filter(s -> s.getScore() >= 60);

        // 获取第二个队伍的Stream流对象
        Stream<String> stream2 = two.stream();
        // 5.第二个队伍根据字符串内容转换成对应的Student对象
        Stream<Student> studentStream2 = stream2.map(Student::new);
        // 6.第二个队伍筛选之后只要前5个人；
        Stream<Student> result2 = studentStream2.limit(5)
                // 7.第二个队伍只要名字为3个字的且包含 静 字的成员；
                .filter(s -> s.getName().length() == 3 && s.getName().contains("静"))
                // 8.第二个队伍只要成绩及格的成员；
                .filter(s -> s.getScore() >= 60);
        // 9.把两个队伍筛选后的结果合并成一个队伍
        Stream<Student> concat = Stream.concat(result1, result2);
        // 10.打印整个队伍的Student对象信息。
        concat.forEach(System.out::println);
    }
}
