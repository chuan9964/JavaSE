package asynchronizetest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardID;
    private double balance;

    final Lock lock = new ReentrantLock();
    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();

        lock.lock();
        if (balance >= money) {
            System.out.println(name+"取走100000.。。");
            balance -= money;

        }else {
            System.out.println("余额不足，请充值...");
        }
        System.out.println("取钱后："+toString());
        lock.unlock();
    }

    public Account() {
    }

    public Account(String cardID, double balance) {
        this.cardID = cardID;
        this.balance = balance;
    }

    /**
     * 获取
     *
     * @return cardID
     */
    public String getCardID() {
        return cardID;
    }

    /**
     * 设置
     *
     * @param cardID
     */
    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    /**
     * 获取
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * 设置
     *
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Account{cardID = " + cardID + ", balance = " + balance + "}";
    }
}
