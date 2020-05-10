package javaSE.io;

import java.io.FileReader;

//读取文件read方法(不建议)
public class Demo03 {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("F:桌面文件/a.txt");


/*        int read = fileReader.read();//只读取一个字符
        int read2 = fileReader.read();//只读取一个字符
        int read3 = fileReader.read();//只读取一个字符

        System.out.print((char) read);
        System.out.print((char) read2);
        System.out.print((char) read3);*/

        //因此使用while循环，当read=-1时结束
        int read = 0;
        while ((read = fileReader.read())!=-1){
            System.out.print((char)read);
        }

        fileReader.close();
    }
}
