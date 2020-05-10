package netWork;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

//接受端
public class UDPDemo02 {
    public static void main(String[] args) throws Exception {
        //开端口
        DatagramSocket socket = new DatagramSocket(9999);
        //接受数据
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf,0,buf.length);
        socket.receive(packet);//阻塞接受
        System.out.println(packet.getAddress());
        System.out.println(new String(packet.getData(),0,packet.getLength()));
        socket.close();
    }
}
