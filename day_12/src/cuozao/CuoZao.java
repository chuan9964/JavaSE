package cuozao;

import java.util.HashMap;
import java.util.List;

public class CuoZao implements Runnable{

    static HashMap<String , Integer> map = new HashMap<>();
    private String name;
    public CuoZao(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        // 任务 是搓澡
        synchronized ("print"){

            System.out.println("号码为:"+name+" 的师傅,正在给["+ this.name +"]搓澡====>盐搓 醋搓");
        }
        //模拟搓澡时间
        try {
            Thread.sleep(7000);//7秒 搓好一个人
            synchronized ("print"){
                if (map.containsKey(name)){
                    map.put(name, map.get(name)+1);
                }else
                    map.put(name, 1);

                System.err.print("号码为:"+name+" 的师傅,["+ this.name +"]搓澡====>完毕！！！");
                System.out.print("[");
                for (Integer i = 0; i < map.get(name); i++) {
                    System.out.print("⭐");
                }
                System.out.println("]");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
