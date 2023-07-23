package javaSE.src.Web.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//先运行服务端在运行客户端
public class Server {
    public static void main(String[] args) throws IOException {
        //TCP协议，接收数据
        //创建ServerSocket对象
        ServerSocket ss = new ServerSocket(10086);
        //监听客户端的连接
        Socket socket = ss.accept();
        //获取输入流并读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int b;
        while ((b = br.read()) != -1) {
            System.out.print((char) b);
        }
        //释放资源
        socket.close();
        ss.close();

    }
}
