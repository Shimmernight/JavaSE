package netWork;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

//接受
public class UDPChat02 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6666);

        while (true){
            //准备接受包裹
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, 0, buf.length);
            socket.receive(packet);

            //判断结束
            byte[] data = packet.getData();
            String receiveData = new String(data, 0, data.length);
            System.out.println(receiveData);
            if (receiveData.equals("bye")){
                break;
            }
        }
        socket.close();
    }
}
