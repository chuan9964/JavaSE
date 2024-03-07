package homework.test01;

public class Account {
    // 1.1、 定义int类型成员变量leftMoney，代表账户余额
    private double leftMoney;


    /**
     * 设置
     *
     * @param leftMoney
     */
    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }

    public String toString() {
        return "Account{leftMoney = " + leftMoney + "}";
    }

    // 1.2、 定义构造方法，给账户初始化
    public Account() {
    }

    public Account(int leftMoney) {
        this.leftMoney = leftMoney;
    }

    // 1.3、 定义deposit方法，给账户存钱
    public void deposit(double money) {
        leftMoney += money;

    }
    // 1.4、 定义getLeftMoney方法，查看账户余额

    /**
     * 获取
     *
     * @return leftMoney
     */
    public double getLeftMoney() {
        return leftMoney;
    }
}
