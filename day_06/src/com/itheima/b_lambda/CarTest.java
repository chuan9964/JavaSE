package com.itheima.b_lambda;

public class CarTest {

    public static void main(String[] args) {
        //需求 调用 CreatCar里面的 create方法
        //创建这个接口的匿名内部类对象。
        CreateCar createCar = new CreateCar() {
            @Override
            public Car create(String name, double price) {
                return new Car(name,price);
            }
        };
        Car car1 = createCar.create("老头乐", 20000);
        // lambda
//        CreateCar createCar2 = (String name, double price)->{return new Car(name,price);};
        CreateCar createCar2 = (name, price)->new Car(name,price);
        CreateCar createCar3 = Car::new;
        System.out.println(createCar3);
        Car car2 = createCar3.create("保时捷",1000000);
        System.out.println(car2);
        /*
         构造器引用
            格式
               类名::new
            使用前提
               1:lambda表达式只是创建对象。
               2:前后参数一致
         */
    }
}
