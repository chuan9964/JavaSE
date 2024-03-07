package homework;

import java.net.*;

/**
 * @Author liuwc
 * @Date 2024-03-02 20:41
 */
public class Client2 {
    public static void main(String[] args) throws Exception {
//        Socket socket = new Socket(InetAddress.getLocalHost(), 6666);

        byte[] buffer = new byte[1024*64];
        DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
        DatagramSocket datagramSocket = new DatagramSocket(6666);
        datagramSocket.receive(datagramPacket);
        String s = new String(buffer, datagramPacket.getOffset(), datagramPacket.getLength());
        System.out.println("s = " + s);
    }
}
