package javaSE.io;

import java.io.FileReader;

//读取文件read方法(建议)
public class Demo04 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("F:/桌面文件/a.txt");

        //一般创建1024的整数倍
        char[] buf = new char[1024];

        int len = 0;
        while ((len = fr.read(buf))!=-1){
            System.out.println(new String(buf,0,len));
        }

        fr.close();
    }
}
