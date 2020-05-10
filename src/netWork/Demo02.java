package netWork;

import java.net.InetSocketAddress;

//端口
public class Demo02 {
    public static void main(String[] args) {
        InetSocketAddress SocketAddress = new InetSocketAddress("127.0.0.1",8080);
        InetSocketAddress SocketAddress2 = new InetSocketAddress("localhost",8080);//端口前添加名字

        System.out.println(SocketAddress);
        System.out.println(SocketAddress2);
        System.out.println(SocketAddress.getAddress());
        System.out.println(SocketAddress.getHostName());//host主机
        System.out.println(SocketAddress.getPort());//端口
    }
}
