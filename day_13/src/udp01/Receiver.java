package udp01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receiver {
    public static void main(String[] args) throws IOException {
        int count = 0;
        DatagramSocket datagramSocket;
        while (true){
            System.out.println("共监听次数 = " + count);
            for (int i = 7000; i < 70000; i++) {
                datagramSocket= new DatagramSocket(i);

                byte[] bytes = new byte[1024 * 64];

                DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

                datagramSocket.receive(datagramPacket);

                String res = new String(bytes, datagramPacket.getOffset(), datagramPacket.getLength());

                System.out.println("res = " + res);
            }

        }


    }
}
