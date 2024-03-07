package asynchronizetest;

public class Test {
    public static void main(String[] args) {
        Account account = new Account("10086", 100000);

        new DrawMoney(account, "小红").start();
        new DrawMoney(account, "小明").start();
    }
}
