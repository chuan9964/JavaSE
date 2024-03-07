package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// 先定义账户类
public class Account {
    private String cardId;
    private double money;//余额


    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }
    /*
     设计一个取钱的方法
        参数   取得钱 金额
        返回值  不需要
         Lock 都是加锁原理
           底层 都是每次只允许一个线程加锁 加锁之后才能访问，手动解锁 其他线程可以再加锁进来。
           灵活的加锁和释放锁

           两个方法
              lock() 加锁  unlock() 释放锁

          Lock接口 用它的实现类
     */
    //成员位置创建一个 Lock锁对象 锁对象不能被改 所以 加上final修饰
    private final Lock lock = new ReentrantLock();

    public  void drawMoney(double money){
            //  局部位置money 代表取的钱
            //  成员位置money 代表余额
            //  this.money -= money;
            // 知道是谁来取的----哪个线程执行到这里了 谁就是哪个线程
            String name = Thread.currentThread().getName();
            // 判断余额是否充足
           lock.lock();//加锁
            if(this.money >= money){//可以取
                System.out.println(name+"来取钱:"+money+" 成功!");
                this.money -= money;
                System.out.println(name+"取钱之后的余额:"+this.money);
                lock.unlock();
            }else {
                System.out.println(name+"来取钱:余额不足,请充值后再去...");
            }

    }



    /**
     * 获取
     * @return cardId
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * 设置
     * @param cardId
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * 获取
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    public String toString() {
        return "Account{cardId = " + cardId + ", money = " + money + "}";
    }
}
