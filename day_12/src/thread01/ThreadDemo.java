package thread01;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        //三英战吕布
        System.out.println("接下来请欣赏  三英战吕布！");
        // 每秒钟 输出  5  4  3  2  1
        for (int i = 5; i >=1 ; i--) {
            System.out.println(i);
            //休眠一秒
            Thread.sleep(1000);
        }
        MyThread bb = new MyThread("刘备");
        System.out.println(bb.getName());
        //        bb.setName("刘备");
        MyThread yy = new MyThread("关羽");
        System.out.println(yy.getName());
        MyThread ff = new MyThread("张飞");
        System.out.println(ff.getName());

        bb.start();
        yy.start();
        ff.start();


    }
}
