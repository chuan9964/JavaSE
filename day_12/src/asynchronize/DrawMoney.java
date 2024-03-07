package asynchronize;
/*
  取钱线程类
 */
public class DrawMoney extends Thread{
    // 定义一个账户的成员变量  --初始化交给了构造 由外界传递进来
    private Account account;
    //  构造第一个参数 是 取钱的账户对象  第二参数 表示线程的名字
    public DrawMoney(Account account,String name){
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        //取钱就是在账户里面 减少余额
        // 调用账户对象 的 取钱方法
        // 小明线程 小红线程 操作的 账户是同一个
        // 在测试类创建 一个账户 传递进来
        account.drawMoney(100000);
    }
}
