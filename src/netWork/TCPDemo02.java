package netWork;

import javax.xml.transform.Source;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class TCPDemo02 {
    public static void main(String[] args) throws Exception {
        //1.有一个端口号
        ServerSocket serverSocket = new ServerSocket(9999);
        //2.等待客户端连接
        Socket socket = serverSocket.accept();//客户端的socket
        //3.读取客户端消息
        InputStream is = socket.getInputStream();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int len;
        while ((len=is.read(buf))!=-1){
            baos.write(buf,0,len);
        }
        System.out.println(baos.toString());

        //关闭资源
        baos.close();
        is.close();
        socket.close();
        serverSocket.close();

    }
}
