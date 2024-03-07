package com.itheima.map01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {

    /*
      Map集合是什么？有什么特点?
         Map是双列集合，也叫键值对儿集合。
            里面的元素是一对儿一对儿的。这一对儿元素称为键值对对象，Entry对象。
            当存储多个 一一对应数据的时候,使用Map。
         特点:
            键唯一,值可以重复,每个键都只能找到自己对应的值。

      Map集合实现类有哪些？
         HashMap  键 唯一 无序  无索引 值无所谓
            LinkedHashMap 键 唯一 有序  无索引 值无所谓
         TreeMap
                  键 唯一 可排序  无索引 值无所谓
      Map集合常用方法:
           集合对象的创建
           一般采用空参构造
           Map<K,V>  泛型K表示键的类型 泛型V表示值的类型
          Map<键的类型,值的类型> map =  new 子类对象<>();
           增  删  改  查
            V put(K key,V value) 存放一对元素
              put有俩层 意思
                如果 键没有在集合中出现,此时put是添加。 V返回是null.
                    键在集合中出现了,此时put是修改。 V 返回的是被替换的值。
              HashMap中是可以存储 null值 null键

             boolean isEmpty() 集合是否为空 为空true

             int size() 查看键值对个数
             clear() 清空 集合中所有键值对全删了

             查  map特点 以键为准的
               V get(K key)根据键找值
             删
               V remove(K key)根据键删除当前的键值对关系
             包含
                boolean containsKey(K k)是否包含指定的键
                boolean containsValue(V v)是否包含指定值
             获取 键集  值集
             Set<K> keySet() 获取键集
             Collection<V> values() 获取值集
           集合的遍历

     */
    public static void main(String[] args) {
        //1:创建集合对象
        Map<String, Integer> map = new HashMap<>();//多态形势下研究 通用方法
        //2:集合里面当前没有内容
        System.out.println("当前集合是不是空的呢？" + map.isEmpty());
        //3:添加键值对元素到 集合中
        map.put("随便", 3);
        map.put("鸡胸肉", 60);
        map.put("全麦面包", 30);
        map.put("安踏鞋", 150);
        map.put("随便", 4);//修改
        //4:查看集合中元素个(对)数
        System.out.println("当前集合有:" + map.size() + "对元素");
        System.out.println(map);
        //5:清空集合--
//        map.clear();
//        System.out.println(map);
        //6:根据键找值 如果找不到 返回null 找到返回对应的值。
        System.out.println("全麦面包的价格:" + map.get("全麦面包"));
        System.out.println("果酱面包的价格:" + map.get("果酱面包"));
        //7:删除
        System.out.println("删除随便:" + map.remove("随便"));
        System.out.println("删除之后的集合:" + map);
        //8:包含 不包含false 包含是true
        System.out.println("是否包含随便的键:" + map.containsKey("随便"));
        System.out.println("是否包含全麦面包的键:" + map.containsKey("全麦面包"));
        System.out.println("是否包含价格为30的商品:" + map.containsValue(30));
        //9:获取键集和值集
        Set<String> keys = map.keySet();
        System.out.println(keys);
        Collection<Integer> values = map.values();
        System.out.println(values);

        //10:从上面方法中选择一下  能不能完成 键值对儿数据的遍历...
        keys.forEach(s -> System.out.println(s + "=" + map.get(s)));
    }
}
