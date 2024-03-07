package exam;

import java.io.Serializable;

/**
 * @Author liuwc
 * @Date 2024-03-04 10:08
 */
public class Student implements Serializable {
    /**
     * 1. 学号（no） String 类型
     * 2. 姓名（name） String 类型
     * 3. 年龄（age） int 类型
     * 4. 籍贯（address） String 类型
     * 5. 班级（className） String 类型
     */

    private String no; //学号
    private String name; //姓名
    private int age; // 年龄
    private String address; //籍贯
    private String className; //班级名称


    public Student() {
    }

    public Student(String no, String name, int age, String address, String className) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.address = address;
        this.className = className;
    }

    /**
     * 获取
     *
     * @return no
     */
    public String getNo() {
        return no;
    }

    /**
     * 设置
     *
     * @param no
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取
     *
     * @return className
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置
     *
     * @param className
     */
    public void setClassName(String className) {
        this.className = className;
    }

    public String toString() {
        // 1001#蒋子华#18#广东#三年一班
        return no + "#" + name + "#" + age + "#" + address + "#" + className;
    }
}
