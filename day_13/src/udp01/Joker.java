package udp01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Joker {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        String host = "192.168.29.22";
        DatagramPacket datagramPacket;
        Scanner sr = new Scanner(System.in);
        while (true){
            //String txt = sr.nextLine();
            String txt = " 为中华之崛起而读书！！！";
            byte[] bytes = txt.getBytes();

            for (int i = 1; i < 255; i++) {
                datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.29."+i), 7788);
                datagramSocket.send(datagramPacket);

                System.out.println("发送给： [" + "192.168.29."+i+"] "+ txt);
            }

        }

    }
}
