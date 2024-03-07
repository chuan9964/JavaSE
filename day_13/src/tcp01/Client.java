package tcp01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        // 1. 使用TCP连接 创建Socket对象
        Socket socket = new Socket("", 7888);
        // 2.通过SOCKET, 把数据发送到客户端
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        DataInputStream input = new DataInputStream(socket.getInputStream());
        Scanner sr = new Scanner(System.in);
        while (true) {
            String str = sr.next();
            output.writeUTF(str);
            // 3.通过socket 接受服务端返回的数据
            String res = input.readUTF();
            System.out.println("res = " + res);

            if (str.equals("byebye")) break;
        }

        // 4.释放资源
        output.close();
        input.close();
        socket.close();
    }
}
