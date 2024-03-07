package thread01test;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 5; i >= 1; i--) {
            Thread.sleep(10);
            System.out.println(i);
        }


        MyThread bb = new MyThread("刘备");
        MyThread yy = new MyThread("关羽");
        MyThread ff = new MyThread("张飞");
        ff.start();
        ff.join();
        bb.start();
        bb.join();
        yy.start();

    }
}
