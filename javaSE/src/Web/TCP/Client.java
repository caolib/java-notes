package javaSE.src.Web.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //TCP协议发送数据
        //创建Socket对象，创建对象时会连接服务器，连接不上就报错
        Socket socket = new Socket("127.0.0.1", 10086);

        //获取socket对象的输出流
        OutputStream os = socket.getOutputStream();
        //写入数据
        os.write("你干嘛哈哈哎哟".getBytes());
        //释放资源
        os.close();
        socket.close();

    }
}
