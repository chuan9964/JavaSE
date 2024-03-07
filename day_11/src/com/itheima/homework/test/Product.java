package com.itheima.homework.test;

public class Product {
    private String pid;
    private String pname;
    private Double price;
    private String categoryName;


    public Product() {
    }

    public Product(String pid, String pname, Double price, String categoryName) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.categoryName = categoryName;
    }

    /**
     * 带参构造函数，拆分字符串
     * @param input
     */
    public Product(String input) {
        String[] split = input.split("#");
        this.categoryName = split[0];
        this.pid = split[1];
        this.pname = split[2];
        this.price = Double.parseDouble(split[3]);
    }

    /**
     * 获取
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * 设置
     * @param pid
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * 获取
     * @return pname
     */
    public String getPname() {
        return pname;
    }

    /**
     * 设置
     * @param pname
     */
    public void setPname(String pname) {
        this.pname = pname;
    }

    /**
     * 获取
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 设置
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String toString() {
        return "Product{pid = " + pid + ", pname = " + pname + ", price = " + price + ", categoryName = " + categoryName + "}";
    }
}
