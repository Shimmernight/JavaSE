package javaSE.io;

import java.io.FileOutputStream;

//写入数据到指定文件
public class Demo01 {
    public static void main(String[] args) throws Exception {
        //创建输出流（管道）
        FileOutputStream os = new FileOutputStream("F:/桌面文件/a.txt");

        //数据
        String data = "hello,io";
        //调用String.getByte()方法将字符串转字节数组
        byte[] bytes = data.getBytes();
        //System.out.println(Arrays.toString(bytes));

        //将数据传给管道
        os.write(bytes);
    }
}
