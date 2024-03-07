package homework.test01;

public class Test {
    public static void main(String[] args) {
        // 3.1、创建账户类Account的对象,初始化余额为1000元
        Account account = new Account(1000);
        // 3.2、创建线程任务Transfer类的对象，传递账户类Account的对象
        Transfer transfer = new Transfer(account);
        // 3.3、创建2个Thread类的对象，传递线程任务Transfer类的对象并指定线程名称
        Thread thread1 = new Thread(transfer, "小李");
        Thread thread2 = new Thread(transfer, "小王");
        // 3.4、2个Thread类的对象分别调用start方法，开启线程
        thread1.start();
        thread2.start();
    }
}
