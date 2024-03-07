package demo07_tcp_tomcat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author liuyp
 * @since 2024/02/28
 */
public class TomcatWorkerRunnable implements Runnable {
    private Socket socket;

    public TomcatWorkerRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // while (true) {
        try {
            //如果想要接收客户端提交过来的数据
            // InputStream is = socket.getInputStream();
            // is.read();


            //直接给客户端返回结果
            OutputStream os = socket.getOutputStream();
            os.write("HTTP/1.1 200\r\n".getBytes());
            os.write("Content-Type: text/html;charset=UTF-8\r\n".getBytes());
            os.write("\r\n".getBytes());
            os.write("<h1>Hello World!!!</h1>".getBytes());
            os.write("<a href='http://www.baidu.com'>百度</a>".getBytes());

            //必须给浏览器返回一个结束标志，否则浏览器会一直转圈
            socket.shutdownOutput();
        } catch (IOException e) {
            System.out.println("断开连接");
        }
        // }
    }
}
