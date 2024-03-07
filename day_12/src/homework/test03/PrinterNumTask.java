package homework.test03;

public class PrinterNumTask implements Runnable {
    // 1.1、定义int类型成员变量num，初始化值1,代表要打印的数字从1开始
    private int num = 1;

    // 1.2、 覆盖重写run方法（使用同步方法或同步代码块保证数据安全）
    // ，按照打印要求实现功能（死循环内部嵌套 同步）
    @Override
    public void run() {
        while (true) {
            synchronized (this){
                // 1.2.1、如果num>52,结束循环
                if (num > 52) break;
                // 1.2.2、如果num<=52,打印数字
                System.out.print(num+" ");
                // 1.2.3、num++
                num++;
            }
        }


    }
}
