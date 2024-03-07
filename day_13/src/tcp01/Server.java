package tcp01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // 1.监听端口 创建serversocket
        ServerSocket serverSocket = new ServerSocket(7888);
        // 2.获取客户端的连接 socket对象，是阻塞方法，如果没有客户端连接  会一直阻塞等待
        Socket socket = serverSocket.accept();
        // 3.通过socket 接受客户端发过来的数据
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        while (true) {
            String res = input.readUTF();
            System.out.println("res = " + res);
            // 4.通过socket 给客户端返回数据
            output.writeUTF("收到你的消息了，谢谢！");
            if (res.equals("byebye")) break;
        }

        // 5.释放资源
        output.close();
        input.close();
        socket.close();
        serverSocket.close();
    }
}
