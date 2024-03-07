package com.itheima.regex;

import java.util.Arrays;

public class RegexTest4 {
    /*
      在字符串中常见 关于正则的方法使用

         String[] split(String regex): 按照规则进行字符串切割,返回切割后的数组
      String replaceAll(String regex,String newString)按照正则的规则进行替换。
     */
    public static void main(String[] args) {

        // String[] split(String regex): 利用规则玩截取
        String s3 = "蔡徐坤78363563吴亦凡123udygdgj嘎子hd766fu潘子";
        // 请把字符串中的人名取出来     \\w 单词字符
        // 使用单词字符 作为 切割的规则  \\w+
        String[] names = s3.split("\\w+");
        System.out.println(Arrays.toString(names));
        // String replaceAll(String regex,String newString)按照正则的规则进行替换。
        //要求  人名之间是 - 隔开
        String s = s3.replaceAll("\\w+", "-");
        System.out.println(s);

        String s2 = "你TMD是小学生吧...MMP.去死吧....TNND";
        System.out.println(s2.replaceAll("TMD|MMP|TNND|死|小学生","**"));



    }
}
