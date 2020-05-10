package netWork.Talk;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TalkReceiver implements Runnable {
    DatagramSocket socket = null;
    int port;
    String msgFrom;

    public TalkReceiver(int port, String msgFrom) {
        this.port = port;
        this.msgFrom = msgFrom;
        try {
            socket = new DatagramSocket(port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            //准备接受包裹
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, 0, buf.length);
            try {
                socket.receive(packet);
                //判断结束
                byte[] data = packet.getData();
                String receiveData = new String(data, 0, data.length);
                System.out.println(msgFrom + receiveData);
                if (receiveData.equals("bye")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        socket.close();
    }
}