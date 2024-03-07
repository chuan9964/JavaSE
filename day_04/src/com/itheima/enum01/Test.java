package com.itheima.enum01;

public class Test {
    public static void main(String[] args) {
        //调用  如果引用类型  搞出它的对象
        recommend(Sex.BOY);
        recommend(Sex.GIRL);
    }

    private static void recommend(Sex girl) {
        switch (girl){
            case BOY -> {
                System.out.println("推荐植物大战僵尸");
            }
            case GIRL -> {
                System.out.println("推荐爱琴公寓");
            }

        }
    }
}
