package exam;

import java.io.*;
import java.lang.reflect.Constructor;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author liuwc
 * @Date 2024-03-04 10:11
 */
public class Server {
    // 2. 请在 Server 类中定义一个 Map 集合，用来存储班级和学生的对应关系
    public static Map<String, List<Student>> map = new HashMap<>();

    // 1. 请定义出来 Server 类，用来表示服务器端类，并包含一个 main 方法。
    public static void main(String[] args) throws Exception {
        // 4 启动服务端
        // 依次调用 readStu 方法、splitStu 方法、start 方法，让服务器端程序成功运转起来
        List<Student> studentList = readStu("javase_exam2\\src\\stus.txt");
        splitStu(studentList);
        start();
    }

    // 3. 请定义出来 readStu 方法、splitStu 方法、start 方法

    // (1) readStu 方法负责完成文件的读取
    public static List<Student> readStu(String filePath) throws Exception {
        List<Student> studentList = new ArrayList<>(); // 存学生对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath)); // 读取文件
        // _1. 请使用 BufferedReader 逐行读取 stu.txt 文件中的所有学生。
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            // _2. 并通过反射的方式创建学生对象，然后封装读取出来的每一个学生。
            // stus.txt示例：1001#蒋子华#18#广东#三年一班
            String[] split = line.split("#");
            // 获取Student的字节码文件
            Class<Student> studentClass = Student.class;
            // 获取全参构造方法
            Constructor<Student> constructor = studentClass.getConstructor(String.class, String.class, int.class, String.class, String.class);
            // 调用构造方法创创建对象
            Student student = constructor.newInstance(split[0], split[1], Integer.parseInt(split[2]), split[3], split[4]);

            // _3. 把读取出来的所有学生存储到一个 List 集合中，并且返回。
            studentList.add(student);
        }
        // 优秀的程序员从不会忘记关闭数据流
        bufferedReader.close();
        // 返回学生集合
        return studentList;
    }

    // (2) splitStu 方法负责完成学生的分类工作
    public static void splitStu(List<Student> studentList) {
        // 1. 把 readStu 方法返回的 List 集合通过方法参数传递进来。

        // 2. 以班级为单位分类学生，并且存储到成员变量 map 集合中。
        Stream<Student> stream = studentList.stream();
        /**
         * // qvq看错要求了
         * // 为map集合收集数据 使用stream.collect()
         *         Map<String, List<Student>> collect = stream.collect(
         *                 // 分组表达为student.classname
         *                 Collectors.groupingBy(Student::getClassName)
         *         );
         */
        // 3. 在分类学生时，请优先使用 Stream 流遍历学生，并且完成学生的分类。
        studentList.stream().forEach(student -> {
            // 获取student的班级，以它为key
            String className = student.getClassName();
            if (map.containsKey(className)) {// 包含key，加入现有的集合
                // 先获取现有集合
                List<Student> tempList = map.get(className);
                // 加进去！
                tempList.add(student);

            } else {// 不包含key，创建新的的集合
                List<Student> tempList = new ArrayList<>();
                // 把这个学生装到集合里面去
                tempList.add(student);
                // 把list集合装到map集合里面去
                map.put(className, tempList);
            }
        });
    }
    // (3) start 方法负责启动服务器端程序
    public static void start() throws IOException {
        // 1. 请使用 ServerSocket 构建 TCP 服务端，并占用 9999 端口号。
        ServerSocket serverSocket = new ServerSocket(9999);

        // 2. 请调用 ServerSocket 的 accept 方法让服务端进行阻塞监听客户端的连接。
        Socket socket = serverSocket.accept();

        // 3. 通过输入流获取到客户端传递过来的班级名称。
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        String data = dis.readUTF();
        System.out.println("接收到客户端发来的数据：" + data);

        // 4. 根据班级名称去 Map 集合里面取出所对应的学生列表。
        List<Student> studentList = map.get(data);

        // 5. 使用序对象流把获取到的学生集合数据写回给服务端 。
        // !学生类要实现实例化接口Serializable
        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        outputStream.writeObject(studentList);

        // 优秀的程序员从不忘关闭数据流
        outputStream.close();
        dis.close();
        socket.close();
    }

}
