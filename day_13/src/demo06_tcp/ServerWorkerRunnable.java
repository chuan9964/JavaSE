package demo06_tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @author liuyp
 * @since 2024/02/28
 */
public class ServerWorkerRunnable implements Runnable{
    private Socket socket;

    public ServerWorkerRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            while (true) {
                //通过Socket，接收客户端发过来的数据。也是阻塞方法，即：如果当前socket里没有数据可读取，就阻塞
                String data = dis.readUTF();
                System.out.println("接收到客户端发来的数据：" + data);
                //通过Socket，给客户端返回数据
                dos.writeUTF("hi");

                if ("byebye".equals(data)) {
                    break;
                }
            }
            //释放资源
            dos.close();
            dis.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("连接已断开");
        }
    }
}
