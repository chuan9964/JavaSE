package wait_notify;

public class QingFengBaoZiPu {

    public static void main(String[] args) {
        //开始准备吃包子
        System.out.println("进入庆丰包子铺 坐了下来 点餐");

        //创建共享资源
        Desk desk = new Desk();

        //有三个厨师  线程
        new Thread(()->{
            //厨师要生产包子
            while(true){
                desk.put();
            }
        },"霍大厨").start();
        new Thread(()->{
            //厨师要生产包子
            while(true){
                desk.put();
            }
        },"雷大厨").start();
        new Thread(()->{
            //厨师要生产包子
            while(true){
                desk.put();
            }
        },"卧龙凤厨").start();
        //有两个吃货 线程
        new Thread(()->{
            //吃货要次包子
            while(true){
                desk.get();
            }
        },"乐吃货").start();
        new Thread(()->{
            //吃货要次包子
            while(true){
                desk.get();
            }
        },"李逵吃货").start();
    }
}
