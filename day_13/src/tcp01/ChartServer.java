package tcp01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChartServer {
    // 群聊队列
    static ArrayList<Socket> socketArrayList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        // 1.监听端口 创建serversocket
        ServerSocket serverSocket = new ServerSocket(7888);


        while (true){
            // 循环不断获取新的socket
            Socket socket = serverSocket.accept();
            // 加入群组队列
            socketArrayList.add(socket);

            new Thread(new ChartServerRunnable(socket)).start();
        }
    }
}
