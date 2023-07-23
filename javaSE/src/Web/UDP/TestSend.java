package javaSE.src.Web.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * UDP特点：面向无连接(不管有没有连接，直接发送数据)，
 * 速度快，一次发送有大小限制，容易丢失数据，安全性不高
 */
public class TestSend {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        //1.创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();
        //2.打包数据
        //2.1 数据
        while (true) {
            String data = sc.nextLine();
            if (data.equals("q")) {
                break;
            }
            byte[] bytes = data.getBytes();
            //2.2 IP
            InetAddress address = InetAddress.getByName("127.0.0.1");
            //2.3 端口
            int port = 10086;
            //2.4 打包
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, address, port);

            //3.发送数据
            ds.send(packet);
        }

        //4.释放资源
        ds.close();
    }
}
