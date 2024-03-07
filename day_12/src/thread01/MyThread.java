package thread01;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);//把名字传递给父类的构造
    }

    //线程任务方法 将来哪个线程对象执行 在它的代码中就可以得到哪个线程对象
    @Override
    public void run() {
         // 干吕布
        Thread thread = Thread.currentThread();//获取当前线程对象
        for (int i = 1; i <=5 ; i++) {
            //每人跟吕布过招 5次
            System.out.println(thread.getName()+"大呼:吕布小儿,莫跑~吃我"+i+"招");
        }

    }
}
