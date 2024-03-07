package demo04_tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @author liuyp
 * @since 2024/02/28
 */
public class Client{
    public static void main(String[] args) throws IOException {
        //1. 使用TCP连接 本机的8888端口：创建Socket对象
        Socket socket = new Socket("127.0.0.1", 8888);

        //2. 通过Socket，把数据发出去到服务端
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF("hello");

        //3. 通过Socket，接收服务端返回的数据
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        String answer = dis.readUTF();
        System.out.println("收到服务端返回结果：" + answer);

        //4. 释放资源
        dis.close();
        dos.close();
        socket.close();
    }
}
