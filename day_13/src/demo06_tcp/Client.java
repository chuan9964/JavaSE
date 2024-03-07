package demo06_tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * 1. 客户端给服务端发送的内容：由用户输入
 * 2. 实现客户端和服务端的持续通信
 * @author liuyp
 * @since 2024/02/28
 */
public class Client{
    public static void main(String[] args) throws IOException {
        //1. 使用TCP连接 本机的8888端口：创建Socket对象
        Socket socket = new Socket("127.0.0.1", 8888);

        Scanner scanner = new Scanner(System.in);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        DataInputStream dis = new DataInputStream(socket.getInputStream());

        while (true) {
            //2. 通过Socket，把数据发出去到服务端：使用Scanner读取用户输入的内容，把内容发出去
            String line = scanner.nextLine();
            dos.writeUTF(line);

            //3. 通过Socket，接收服务端返回的数据
            String answer = dis.readUTF();
            System.out.println("收到服务端返回结果：" + answer);

            //如果用户输入的内容是byebye，就结束
            if ("byebye".equals(line)) {
                break;
            }
        }

        //4. 释放资源
        dis.close();
        dos.close();
        socket.close();
    }
}
