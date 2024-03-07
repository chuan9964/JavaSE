package demo06_tcp;

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

        //2. 死循环：不断尝试接受客户端的连接。有几个客户端连接进来，就接受几个连接
        while (true) {
            //3. 获取客户端的连接：Socket对象。是阻塞方法。如果没有客户端连接进来，就一直阻塞等待
            Socket socket = serverSocket.accept();

            //4. 创建一个线程，由这个新线程专门负责它的通信。线程本身是异步的
            new Thread(new ServerWorkerRunnable(socket)).start();
        }

        // serverSocket.close();
    }
}
