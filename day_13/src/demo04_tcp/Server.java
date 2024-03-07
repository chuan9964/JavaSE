package demo04_tcp;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author liuyp
 * @since 2024/02/28
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //1. 监听8888端口：创建ServerSocket
        ServerSocket serverSocket = new ServerSocket(8888);

        //2. 获取客户端的连接：Socket对象。是阻塞方法。如果没有客户端连接进来，就一直阻塞等待
        Socket socket = serverSocket.accept();

        //3. 通过Socket，接收客户端发过来的数据
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        String data = dis.readUTF();
        System.out.println("接收到客户端发来的数据：" + data);

        //4. 通过Socket，给客户端返回数据
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF("hi");

        //5. 释放资源
        dos.close();
        dis.close();
        socket.close();
        serverSocket.close();
    }
}
