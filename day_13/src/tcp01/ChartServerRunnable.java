package tcp01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ChartServerRunnable implements Runnable {
    private Socket socket;

    public ChartServerRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            // 3.通过socket 接受客户端发过来的数据
            DataInputStream input = new DataInputStream(socket.getInputStream());
            while (true) {
                // 读取客户端发的数据
                String message = input.readUTF();
                System.out.println(socket.getInetAddress()+" : "+ message);
                // 转发给所有客户端(除了自己)
                for (Socket socket : ChartServer.socketArrayList) {
                    // 不向自己发送
                    if (socket.equals(this.socket)) continue;
                    // 与所有socket建立输出流 转发这条消息
                    DataOutputStream output = new DataOutputStream(socket.getOutputStream());
                    output.writeUTF(message);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
