package com.itheima.static03;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        String printArr = ArrayUitl.printArr(arr1);
        System.out.println(printArr);

        double[] arr2 = {10.23,65.3,646.6,15.5};
        double average = ArrayUitl.average(arr2);
        System.out.println(average);
    }
}
