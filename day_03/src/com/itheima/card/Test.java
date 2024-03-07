package com.itheima.card;

import java.util.ArrayList;

public class Test {
    //拼接一副扑克牌

    public static void main(String[] args) {
        String[] color = {"♥", "♣", "♦", "♠"};
        String[] template = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "1", "2"};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < template.length; j++) {
                list.add(color[i] + template[j]);
            }
        }
        list.add("大王");
        list.add("小王");
        System.out.println(list);
    }
}
