package exam;

import java.io.*;
import java.net.Socket;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author liuwc
 * @Date 2024-03-04 11:15
 */
public class Client {
    // 1. 请定义 Client 类，用来表示客户端类，并包含一个 main 方法
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        start();//启动
    }
    // 2. 请定义出来 start 方法、writeStu 方法

    // (1) start 方法用来启动客户端
    public static void start() throws IOException, ClassNotFoundException {
        // 1. 请使用 Socket 构建 TCP 客户端，并指定服务端 IP 地址和端口号。
        Socket socket = new Socket("localhost", 9999);

        // 2. 提示用户输入 班级名称 来获取学生信息。
        Scanner sr = new Scanner(System.in);
        System.out.println("请输入班级名称：");
        String input = sr.nextLine();

        // 3. 通过输出流把班级名称写给服务端。
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF(input);

        // 4. 通过对象流包装输入流获取到服务端返回的学生信息。
        ObjectInputStream dis = new ObjectInputStream(socket.getInputStream());
        Object readObject = dis.readObject();

        // 将读取的对象转换成List<Student>
        List<Student> studentList = (List<Student>) readObject;

        // 5. 使用 Stream 流对获取到的学生进行学号升序排序。
        List<Student> sortedStudentList = studentList.stream().sorted(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int no1 = Integer.parseInt(o1.getNo());
                int no2 = Integer.parseInt(o2.getNo());
                return no1 - no2;
            }
        })
        .collect(Collectors.toList());

        // 6. 调用 writeStu 方法来把学生信息写入到文件中。
        writeStu(sortedStudentList);

        // 优秀的程序员从不忘记关掉数据流
        dis.close();
        dos.close();
        socket.close();
    }

    // (2) writeStu 方法负责把学生数据写入到文件中
    public static void writeStu(List<Student> studentList) throws IOException {
        // 4. 为了确保写入操作更高效，请优先使用包装流。
        FileWriter fileWriter = new FileWriter("javase_exam2\\src\\" + studentList.get(0).getClassName());
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // 1. 请使用 Stream 流对学生集合进行遍历。
        studentList.stream().forEach(student -> {
            // 2. 拼接出与原文件格式一样的格式内容。
            // template : 1001#蒋子华#18#广东#三年一班
            // 重写Student.toString()好了

            // 3. 使用 IO 流把内容保存到文件中。
            try {
                bufferedWriter.write(student.toString());
                bufferedWriter.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });

        // 优秀的程序员从不忘记关闭数据流
        bufferedWriter.close();
        fileWriter.close();
    }
}
