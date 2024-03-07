package homework.test02;

public class CopyRunnable implements Runnable{
    // 2.1、定义Punishment类型成员变量punishment
    private Punishment punishment;

    // 2.2、定义构造方法，给成员变量punishment赋值
    public CopyRunnable(Punishment punishment){
        this.punishment = punishment;
    }
    @Override
    public void run() {

        int count = 0;
        String threadName = Thread.currentThread().getName();
        // 2.3、覆盖重写run方法（使用同步方法或同步代码块保证数据安全），
        // 按照打印要求实现功能
        while (true){
            synchronized (this){
                if (punishment.getLeftCount() > 0){
                    int leftCount = punishment.getLeftCount();
                    System.out.println(threadName+"线程-抄写一遍"+punishment.getCopyWord()+"。两人总共还要抄写"+(--leftCount)+"次");
                    punishment.setLeftCount(leftCount);
                    count++;
                }else break;
            }

        }

        System.out.println(threadName+"抄写了："+count);
    }
}
