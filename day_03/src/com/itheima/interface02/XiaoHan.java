package com.itheima.interface02;
//小韩是学生  会开车  会唱歌
public class XiaoHan extends Student implements Driver,Singger{
    @Override
    public void drive() {
        System.out.println("得飘得飘 得咿的飘~~~ 单手开车");
    }

    @Override
    public void stopCar() {
        System.out.println("用叉车停车...");
    }

    @Override
    public void sing() {
        System.out.println("唱  鸡你太美！！！");
    }
}
