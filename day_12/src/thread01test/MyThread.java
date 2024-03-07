package thread01test;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        String thread = Thread.currentThread().getName();
        for (int i = 1; i <= 10; i++) {

            System.out.println(thread+"攻击了"+i+"次");

        }
    }
}
