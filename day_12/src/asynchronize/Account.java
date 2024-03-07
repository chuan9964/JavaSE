package asynchronize;
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
     */
    public void drawMoney(double money){
        //  局部位置money 代表取的钱
        //  成员位置money 代表余额
        //  this.money -= money;
        // 知道是谁来取的----哪个线程执行到这里了 谁就是哪个线程
        String name = Thread.currentThread().getName();
        // 判断余额是否充足
        if(this.money >= money){//可以取
            System.out.println(name+"来取钱:"+money+" 成功!");
            this.money -= money;
            System.out.println(name+"取钱之后的余额:"+this.money);
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
