package javaSE.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        //FileWriter fileWriter = new FileWriter("F:/桌面文件/a.txt");//会覆盖
        FileWriter fileWriter = new FileWriter("F:/桌面文件/a.txt",true);//不覆盖

        fileWriter.write("fileWriter");//写入缓冲区

        fileWriter.close();//包含了flush方法（写入内存中）
    }
}
