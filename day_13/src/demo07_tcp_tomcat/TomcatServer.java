package demo07_tcp_tomcat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author liuyp
 * @since 2024/02/28
 */
public class TomcatServer {
    public static void main(String[] args) throws IOException {
        //1. 监听8080端口。浏览器访问地址的格式 http://ip地址:8080
        ServerSocket serverSocket = new ServerSocket(8080);

        //2. 死循环
        while (true) {
            //3. 不断尝试接受客户端的连接，得到Socket
            Socket socket = serverSocket.accept();
            //4. 把socket交给一个新线程进行处理
            new Thread(new TomcatWorkerRunnable(socket)).start();
        }
    }
}
