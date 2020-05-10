package netWork;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//发送端
public class UDPDemo01 {
    public static void main(String[] args) throws Exception {
        //1.建立socket
        DatagramSocket socket = new DatagramSocket(8000);
        String msg = "你好啊";
        InetAddress ip = InetAddress.getByName("localhost");
        int port = 9999;
        //2.建个包
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, ip, port);
        //3.发送数据
        socket.send(packet);
        //4.关闭资源
        socket.close();
    }
}
