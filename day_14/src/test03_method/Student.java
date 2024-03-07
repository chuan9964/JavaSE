package test03_method;

/**
 * @Author liuWeichuan
 * @Date 2024-02-29 11:06
 */
public class Student {
    private String name;
    private Integer age;


    public Student() {
    }

    private Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    public String eat(String food) {
        System.out.println("我爱吃："+food);
        return "hhhhh";
    }

    private void sleep(String hours) {
        System.out.println("我爱睡大觉："+hours);
    }

}
