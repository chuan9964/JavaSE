package cuozao;

import java.util.Scanner;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        // 线程池对象
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                5,// 核心线程数量
                8,// 最大线程数量
                10,// 最大空闲时间
                TimeUnit.SECONDS,// 最大空闲时间的单位
                new ArrayBlockingQueue<>(5),// 任务阻塞队列
                Executors.defaultThreadFactory(),// 线程工厂
                new ThreadPoolExecutor.CallerRunsPolicy()// 拒绝策略
        );



        Scanner sr =new Scanner(System.in);
        while (true){
            System.out.println(threadPool.getQueue());
            String s = sr.next();
            CuoZao cuoZao = new CuoZao(s);
            threadPool.execute(cuoZao);
        }

    }
}
