package com.itheima.test02;

class Super {
    public void printVal() {
        System.out.println("Super");
    }
}
class Sub extends Super {
    public void printVal(){
        System.out.println("Sub");
    }
}
class Demo {
    public static void main(String[] args) {
        Super sup = new Sub();
        sup.printVal();
    }
}