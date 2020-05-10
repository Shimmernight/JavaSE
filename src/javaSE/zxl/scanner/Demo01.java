package javaSE.zxl.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //1.创建一个Scanner扫描器,获取键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方法接收");

        //2.判断用户是否输入（在此等待）
        if (scanner.hasNext()){
            //3.使用next方法接收
            String str = scanner.next();
            System.out.print("输出内容为:"+str);
        }

        //4.凡是使用IO流的类，如果不关掉会一直占用内存，所以要及时关闭
        scanner.close();
    }
}
