package com.itheima.static03;

public class ArrayUitl {
    //打印数组
    public static String printArr(int[] arr) {
        if (arr.length == 0) return "[]";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < arr.length - 1; i++) {
            stringBuilder.append(arr[i] + ",");
        }
        stringBuilder.append(arr[arr.length - 1]);
        stringBuilder.append("]");
        return new String(stringBuilder);
    }

    //求平均值
    public static double average(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
