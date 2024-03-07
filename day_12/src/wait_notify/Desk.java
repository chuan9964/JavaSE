package wait_notify;

import java.util.ArrayList;
import java.util.List;

/*
   定义桌子类
       定义一个存储包子的集合 存储包子

       定义一个厨师生产包子的方法

       定义一个吃货吃包子的方法
 */
public class Desk {
    //  定义一个存储包子的集合 存储包子
    private List<String> list = new ArrayList<>();

    // 定义一个厨师生产包子的方法
    public synchronized void put()  {

        try{
            //获取厨师线程对象的名称
            String name = Thread.currentThread().getName();
            //判断有没有包子
            if(list.size()==0){//没有包子 厨师要做包子
                System.out.println("厨师:"+name+"正在做包子.....");
                //等待和唤醒方法 一般采用共享资源进行调用
                //模拟做包子的时间
                Thread.sleep(2000);
                //包子做完了
                list.add(name+"做的包子..");//生产包子 把包子放到集合中
            }
            //唤醒所有的吃货
            this.notifyAll();
            //厨师进入休息 等待 因为桌子上有包子了。
            this.wait();

        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
    //定义一个 吃货 吃包子的方法
    public synchronized  void get() {

        try{
            //获取吃货的名称
            String name = Thread.currentThread().getName();
            //先判断有没有包子
            if(list.size()==1){
                //模拟吃包子
                System.out.println("吃货:"+name+"正在吃"+list.get(0));
                Thread.sleep(1500);
                //吃饭之后
                list.clear();//清空
            }
            //唤醒厨师
            this.notifyAll();
            //吃货休息
            this.wait();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
