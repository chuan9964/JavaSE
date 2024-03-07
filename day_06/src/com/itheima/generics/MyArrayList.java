package com.itheima.generics;

import java.sql.Connection;
import java.util.Arrays;

public class MyArrayList<E> {

    private int porint = 0;
    private int size = 0;
    private int maxLength = 0;
    private Object[] arr;


    /**
     * 添加元素至集合
     *
     * @param e 元素
     */
    public void add(Object e) {
        if (arr == null) {
            maxLength++;
            arr = new Object[maxLength];
        }

        if (porint == maxLength) {
            // 复制数组 并 扩容至原来2倍
            arr = Arrays.copyOf(arr, maxLength * 2);
        }

        arr[porint] = e;



        porint++;

    }

    /**
     * 获取指定位置元素
     *
     * @param i index
     */
    public Object get(int i) {
        return arr[i];
    }

    /**
     * 删除指定位置元素
     *
     * @param i index
     */
    public void remove(int i) {
        porint--;
        for (int j = i; j < porint; j++) {
            arr[j] = arr[j + 1];
        }
    }
}
