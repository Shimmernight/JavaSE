package netWork;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端
public class TCPDemo01 {
    public static void main(String[] args) throws Exception {
        //1.要知道服务器的ip，端口号
        InetAddress ip = InetAddress.getByName("127.0.0.1");//ip
        int port = 9999;//端口号
        //创建socket
        Socket socket = new Socket(ip,port);
        //发送消息
        OutputStream os = socket.getOutputStream();

        os.write("你好".getBytes());

        //关闭资源
        os.close();
        socket.close();

    }

}
