package homework.test01;

public class Transfer implements Runnable {

    // 2.1、定义Account类型成员变量account
    private Account account;

    // 2.2、定义构造方法，给成员变量account赋值
    public Transfer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        // 2.3、覆盖重写run方法（使用同步方法或同步代码块保证数据安全），
        // 方法内部使用for循环，执行10次存钱，并打印账户余额的操作
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 10; i++) {
            double putNum = 100;
            synchronized (this){
                account.deposit(putNum);
                System.out.println(name + " 存入" + putNum +"元后，账户余额是："+account.getLeftMoney());
            }
        }

    }
}
