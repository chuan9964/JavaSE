package asynchronizetest;

public class DrawMoney extends Thread{
    private Account account;

    public DrawMoney(Account account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {

        account.drawMoney(100000);
    }
}
