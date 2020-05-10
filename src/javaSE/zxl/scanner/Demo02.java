package javaSE.zxl.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用nextLine方法接收");

        //等待用户输入
        if (scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.print(str);
        }

        //及时关闭IO流
        scanner.close();
    }
}
