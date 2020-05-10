package netWork;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;

public class client01 {
    public static void main(String[] args) throws Exception {
        //1.获取服务端ip和端口
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        int port = 9999;
        //2.创建socket对象
        Socket socket = new Socket(ip,port);
        //3.获取输出流
        OutputStream os = socket.getOutputStream();
        //4.创建文件输入流
        FileInputStream fis = new FileInputStream("F:/桌面文件/a.txt");
        //5.写文件
        byte[] buf = new byte[1024];//缓冲区
        int len;
        while ((len=fis.read(buf))!=-1){
            os.write(buf,0,len);
        }
        //通知传输结束
        socket.shutdownOutput();//输出完了

        //等服务端接收完
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf2 = new byte[1024];
        int len2;
        while ((len2=is.read(buf2))!=-1){
            baos.write(buf2,0,len2);
        }
        System.out.println(baos.toString());
        //6.关闭资源
        baos.close();
        is.close();
        fis.close();
        os.close();
        socket.close();
    }
}
