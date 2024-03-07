package homework.test03;

public class PrinterCharTask implements Runnable{
    // 2.1、定义char类型成员变量ch，初始化值‘A’,代表要打印的字母从A开始
    char ch = 'A';
    // 2.2、 覆盖重写run方法（使用同步方法或同步代码块保证数据安全），
    // 按照打印要求实现功能（死循环内部嵌套 同步）
    @Override
    public void run() {
        while (true){
            synchronized (this){
                // 2.1、如果ch>‘Z’,结束循环
                if (ch >'Z') break;
                // 2.2、如果ch<=‘Z’,,打印字母
                System.out.print(ch+" ");
                // 2.3、ch++
                ch++;
            }

        }

    }
}
