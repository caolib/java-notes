package javaSE.src.Web.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TestReceive {
    public static void main(String[] args) throws IOException {
        //1.创建DatagramSocket对象,接收数据的时候一定要绑定端口号，并且发送数据和接收数据的端口号要一致
        DatagramSocket ds = new DatagramSocket(10086);

        //2.接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        while (true) {
            ds.receive(packet);
            //3.解析数据包
            byte[] data = packet.getData();
            String res = new String(data, 0, packet.getLength());
            System.out.println("接收到数据:" + res);
            System.out.println("数据是从ip为" + packet.getAddress() + "的" + packet.getPort() + "端口发出的");
        }

//        //4.释放资源
//        ds.close();

    }
}
