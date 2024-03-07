package com.itheima.list01;

import java.util.ArrayList;

public class ListDemo01 {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("AAA");
        list.add("CCC");
        list.add(1,"BBB");

        String set = list.set(0, "111");
        System.out.println("set 0:"+set);

        String remove = list.remove(2);
        System.out.println("remove 2:"+remove);

        String s = list.get(0);
        System.out.println("get 0:"+s);


    }
}
