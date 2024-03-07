package homework;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Author liuwc
 * @Date 2024-03-02 20:41
 */
public class Client1 {
    public static void main(String[] args) throws Exception {
        // 准备发送内容
        String text = "你好，世界！";
        byte[] buffer = text.getBytes();
        // 准备数据包
        DatagramPacket datagramPacket = new DatagramPacket(buffer,buffer.length,InetAddress.getLocalHost(),6666);
        // 建立通信套接字
        DatagramSocket datagramSocket = new DatagramSocket();
        // 发送数据包
        datagramSocket.send(datagramPacket);
    }
}
