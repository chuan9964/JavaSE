package com.itheima.overwrite;

public class Shapigou extends Dog{

    @Override
    public void eat(){
        super.eat();
        System.out.println("吃骨头");
    }
}
