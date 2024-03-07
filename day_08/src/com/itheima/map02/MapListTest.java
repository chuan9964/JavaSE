package com.itheima.map02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MapListTest {

    public static void main(String[] args) {
        /*
          分析结构
             江苏省        南京市、扬州市、苏州市、无锡市、常州市
             湖北省        武汉市、孝感市、十堰市、襄阳市、宜昌市
             河北省        邯郸市、邢台市、承德市、衡水市、保定市、廊坊市、唐山市
             String       List<String>
         */
        //设计 Map集合 键 String 值 List<String>
        HashMap<String, List<String>> map = new HashMap<>();
        // map.put(键,值)
        List<String> jsList = new ArrayList<>();
        Collections.addAll(jsList,"南京市","扬州市","苏州市","无锡市","常州市");
        map.put("江苏省",jsList);

        List<String> hbList = new ArrayList<>();
        Collections.addAll(hbList,"武汉市","孝感市","十堰市","襄阳市","宜昌市");
        map.put("湖北省",hbList);

        System.out.println(map);
    }
}
