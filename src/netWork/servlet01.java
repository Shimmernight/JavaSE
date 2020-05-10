package netWork;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class servlet01 {
    public static void main(String[] args) throws IOException {
        //1.创建服务端接口
        ServerSocket serverSocket = new ServerSocket(9999);
        //2.等待连接
        Socket socket = serverSocket.accept();
        //3.输入流
        InputStream is = socket.getInputStream();
        //4.创建文件输出流
        FileOutputStream fos = new FileOutputStream("receive.txt");
        //5.输出文件
        byte[] buf = new byte[1024];
        int len;
        while ((len=is.read(buf))!=-1){
            fos.write(buf,0,len);
        }
        //通知客户端，接收完毕
        OutputStream os = socket.getOutputStream();
        os.write("接受完毕".getBytes());
        //6.关闭资源
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();

    }

}
