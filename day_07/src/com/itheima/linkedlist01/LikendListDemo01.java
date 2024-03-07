package com.itheima.linkedlist01;

import java.util.LinkedList;
import java.util.Queue;

public class LikendListDemo01 {

    public static void main(String[] args) {
        /*
          用LinkedList模拟 小火车过山洞...模拟 队列结构

           队列结构
              先进先出 FIFO

         */
        LinkedList<String> list = new LinkedList<>();
        //入队 进山洞
        list.addLast("火车头");
        list.addLast("第一节车厢");
        list.addLast("第二节车厢");
        list.addLast("第三节车厢");
        list.addLast("火车尾");

        //出山洞
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());


    }
}
