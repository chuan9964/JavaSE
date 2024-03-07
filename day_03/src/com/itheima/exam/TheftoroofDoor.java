package com.itheima.exam;

public class TheftoroofDoor extends Door implements Lock,DoorBell{

    /**
     * 拍照存档
     */
    @Override
    public void takePictrues() {
        System.out.println("铃.......咔嚓.......拍照已存储");
    }

    /**
     * 上锁
     */
    @Override
    public void lockUp() {
        System.out.println("插进钥匙，向左旋转钥匙三圈，锁上了，拔出钥匙。");
    }

    /**
     * 开锁
     */
    @Override
    public void openLock() {
        System.out.println("插进钥匙，向右旋转钥匙三圈，锁打开了，拔出钥匙。");
    }

    /**
     * 开门
     */
    @Override
    public void open() {
        System.out.println("用力推，门打开了。");
    }
    /**
     * 关门
     */
    @Override
    public void close() {
        System.out.println("轻轻拉门，门关上了。");
    }
}
