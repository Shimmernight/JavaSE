package netWork;

import java.net.InetAddress;
import java.net.UnknownHostException;

//ip
public class Demo01 {
    public static void main(String[] args) {

        try {
            InetAddress localHost = InetAddress.getLocalHost();
            InetAddress byName = InetAddress.getByName("localhost");
            System.out.println(localHost);
            System.out.println(byName);

        } catch (UnknownHostException e) {//抛出异常
            e.printStackTrace();
        }
    }

}
