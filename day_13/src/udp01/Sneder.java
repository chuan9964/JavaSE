package udp01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Sneder {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();

        String txt = "为中华之崛起而读书!!!";
        byte[] bytes = txt.getBytes();

        DatagramPacket datagramPacket;
        while (true)
        for (int i = 1; i < 255; i++) {
            // 29.22"
            String host = "192.168.29.22";
            datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName(host), 7788);
            datagramSocket.send(datagramPacket);

            System.out.println("发送给： [" + host+"] "+txt );
        }
        //datagramSocket.close();

    }
}

