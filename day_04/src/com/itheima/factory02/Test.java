package com.itheima.factory02;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Integer[] arr = {1,5,6,7,98,6};

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };


        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
    }
}
