package netWork;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

//发送
public class UDPChat01 {
    public static void main(String[] args) throws Exception {
        //开启端口
        DatagramSocket socket = new DatagramSocket(8888);

        while (true){
            //准备数据：创建控制台
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String data = reader.readLine();
            byte[] datas = data.getBytes();
            DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress("localhost",6666));
            socket.send(packet);
            //退出
            if (data.equals("bye")){
                break;
            }
        }
        socket.close();
    }
}
