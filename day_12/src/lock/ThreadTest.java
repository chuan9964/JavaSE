package lock;

public class ThreadTest {

    public static void main(String[] args) {
        //创建一个账户对象   小明和小红 共享账户   卡号        余额
        Account account = new Account("ICBC-114",100000);
        //创建两个线程对象 分别代表小红 和 小明
        // 线程对象中传递 共享的账户 以及 线程名字
        new DrawMoney(account,"小明").start();
        new DrawMoney(account,"小红").start();
    }
}
