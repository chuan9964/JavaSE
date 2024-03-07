package com.itheima.testplus03;

public class TestPlus03 {
    // 定义落下的高度为1000
    private static float height = 1000;
    private static float totalHeight = 0;

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            totalHeight = 0;
            System.out.println("第" + i + "次弹跳：" + fall(i));
            System.out.println("共经过的：" + (totalHeight));
            System.out.println("=============================");
        }
    }

    private static float fall(int step) {
        // 退出条件：回退到第1次弹跳
        if (step == 0) return height;
        // 递推规律：知道前一次弹跳才能计算本次弹跳
        float before = fall(step - 1);
        // 总的经过路程
        totalHeight += before * 1.5;
        // 返回：本次弹起高度是上次一半
        return before / 2;
    }
}
