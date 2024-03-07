package com.itheima.testplus02;

public class TestPlus02 {
    public static void main(String[] args) {
        System.out.println(getCount(12));
    }

    private static int getCount(int month) {
        // 断如果month的值是1或者2,直接返回1
        if (month < 3) return 1;
        // 否则递归调用getCount方法分别传递month-1和month-2,累加求和并返回
        return getCount(month - 1) + getCount(month - 2);
    }
}
