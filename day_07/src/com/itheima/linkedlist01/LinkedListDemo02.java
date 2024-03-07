package com.itheima.linkedlist01;

import java.util.LinkedList;

public class LinkedListDemo02 {

    public static void main(String[] args) {
        /*
         模拟弹夹  发射子弹
             栈结构
               特点 先进后出 FILO
         */
        LinkedList<String> danJia = new LinkedList<>();

        // 压 子弹
        danJia.addFirst("第一颗子弹");//每次都在最上面
        danJia.addFirst("第二颗子弹");//每次都在最上面
        danJia.addFirst("第三颗子弹");//每次都在最上面
        danJia.addFirst("第四颗子弹");//每次都在最上面

        // 射子弹
        System.out.println(danJia.removeFirst());//每次射最上面的
        System.out.println(danJia.removeFirst());
        System.out.println(danJia.removeFirst());
        System.out.println(danJia.removeFirst());
    }
}
