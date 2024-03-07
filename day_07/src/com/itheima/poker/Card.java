package com.itheima.poker;

public class Card {
    private String number;
    private String color;
    private int size;


    public Card() {
    }

    public Card(String number, String color, int size) {
        this.number = number;
        this.color = color;
        this.size = size;
    }

    /**
     * 获取
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * 设置
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

    public String toString() {
        return color+number;
    }
}
