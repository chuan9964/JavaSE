package com.itheima.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;

public class Room {
    // 全部扑克牌
    private ArrayList<Card> pokerBox = new ArrayList<>();

    // 玩家1
    private ArrayList<Card> gamer1_PokerBox = new ArrayList<>();

    // 玩家2
    private ArrayList<Card> gamer2_PokerBox = new ArrayList<>();

    // 玩家3
    private ArrayList<Card> gamer3_PokerBox = new ArrayList<>();

    // 底牌
    private ArrayList<Card> end_PokerBox = new ArrayList<>();

    // 地主
    private ArrayList<Card> boss_PokerBox;

    // 码牌器
    Comparator gamerComparator = new Comparator<Card>() {
        @Override
        public int compare(Card o1, Card o2) {
            return o2.getSize() - o1.getSize();
        }
    };

    public Room() {
        // 房间对象一出现,就要完成牌的准备
        String[] color = {"♦", "♣", "♥", "♠"};// 花色大小顺序是：黑桃>红桃>梅花>方块。
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int index = 0;
        // 产生54张牌
        for (String value : number) {
            for (String s : color) {
                Card card = new Card(s, value, index++);
                pokerBox.add(card);
            }
        }
        pokerBox.add(new Card("小王", "", 52));
        pokerBox.add(new Card("大王", "", 53));

        // 输出验证
        pokerBox.forEach(System.out::println);
    }

    public void start() {
        // 1:洗牌---将集合中牌面打乱....Collections.shuffle方法
        Collections.shuffle(pokerBox);

        // 2:发牌 定义三个玩家集合,还得有个底牌集合
        for (int i = 0; i < pokerBox.size() - 3; ) {
            gamer1_PokerBox.add(pokerBox.get(i++));
            gamer2_PokerBox.add(pokerBox.get(i++));
            gamer3_PokerBox.add(pokerBox.get(i++));
        }
        end_PokerBox.addAll(pokerBox.subList(51, 54));

        // 3:发完牌 三个玩家都有牌了. 对玩家手里牌进行排序----Collections.sort(,)
        Collections.sort(gamer1_PokerBox, gamerComparator);
        Collections.sort(gamer2_PokerBox, gamerComparator);
        Collections.sort(gamer3_PokerBox, gamerComparator);

        // 4:查看三个玩家手里的牌。
        System.out.println("玩家1：" + gamer1_PokerBox);
        System.out.println("玩家2：" + gamer2_PokerBox);
        System.out.println("玩家3：" + gamer3_PokerBox);
        System.out.println("底牌：" + end_PokerBox);

        // 5:抢地主
        Random random = new Random();
        int rand = random.nextInt(3);
        if (rand == 0){
            boss_PokerBox = gamer1_PokerBox;
        }else if (rand == 1){
            boss_PokerBox = gamer2_PokerBox;
        }else{
            boss_PokerBox = gamer3_PokerBox;
        }

        boss_PokerBox.addAll(end_PokerBox);
        // 6:地主牌也需要进行排序，展示地主牌
        Collections.sort(boss_PokerBox, gamerComparator);
        System.out.println("地主牌：" + boss_PokerBox);
    }
}
