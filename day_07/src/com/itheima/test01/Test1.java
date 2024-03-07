package com.itheima.test01;

import java.util.ArrayList;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        // 1.创建一个集合存储5个人的名称
        ArrayList<String> player = new ArrayList<>();
        player.add("张三");
        player.add("李四");
        player.add("王五");
        player.add("赵六");
        player.add("钱七");

        // 2.创建一个集合存储5个阄的内容
        ArrayList<String> game = new ArrayList<>();
        game.add("学羊叫5声");
        game.add("蛙跳10个");
        game.add("吃芥末");
        game.add("喝一杯啤酒");
        game.add("做10个俯卧撑");

        Random random = new Random();

        // 3.遍历名称的集合，获取每一个参与人员的名称
        for (int i = 0; i < player.size(); i++) {
            // 4.生成一个随机数作为存储5个阄的集合的索引，从该集合中随机获取一个元素，并且删除获取到的元
            int index = random.nextInt(game.size());
            // 5.在控制台输出结果
            System.out.println(player.get(i) + game.get(index));
            game.remove(index);
        }





    }
}
