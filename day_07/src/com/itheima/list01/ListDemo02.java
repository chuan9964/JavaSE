package com.itheima.list01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("======================");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("======================");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("======================");
        list.forEach(System.out::println);

    }
}
