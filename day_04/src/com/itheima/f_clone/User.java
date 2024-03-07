package com.itheima.f_clone;

public class User implements Cloneable{
    private String id; //编号
    private String username; //用户名
    private String password; //密码
    private double[] scores; //分数


    public User() {
    }

    public User(String id, String username, String password, double[] scores) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.scores = scores;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return scores
     */
    public double[] getScores() {
        return scores;
    }

    /**
     * 设置
     * @param scores
     */
    public void setScores(double[] scores) {
        this.scores = scores;
    }

    public String toString() {
        return "User{id = " + id + ", username = " + username + ", password = " + password + ", scores = " + scores + "}";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        User u = (User) super.clone();//先克隆出来一份新的 User对象 只是里面数组 是相同地址
          //u 新的空间  this 旧空间
            // u.scores  数组     this.scores 数组 同一个地址
           //对象里面引用类型 再次进行克隆

        //         数组再次进行克隆  数组两个地址
                   // 让这个u.scores 数组 克隆出来一份 有新地址  把新地址 给 u.scores
       u.scores =  u.scores.clone();// 搞出一个新的数组地址  复制 新的对象

       return u;
    }
}
