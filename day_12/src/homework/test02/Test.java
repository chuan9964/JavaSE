package homework.test02;

public class Test {
    public static void main(String[] args) {
        //3.1、创建惩罚类Punishment的对象,初始化抄写次数为100,抄写内容为HelloWorld
        Punishment punishment = new Punishment(1000,"HelloWorld");
        //3.2、创建线程任务CopyRunnable类的对象，传递惩罚类Punishment的对象
        CopyRunnable task = new CopyRunnable(punishment);
        //3.3、创建2个Thread类的对象，传递线程任务CopyRunnable类的对象并指定线程名称
        Thread t1 = new Thread(task, "小明");
        Thread t2 = new Thread(task, "小王");
        //3.4、2个Thread类的对象分别调用start方法，开启线程
        t1.start();
        t2.start();


    }
}
