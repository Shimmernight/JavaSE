package javaSE.zxl.struct;

import java.util.Scanner;

public class SwitchDemo02 {
    //JDK1.7以后，switch支持string
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        switch (str) {
            case "中国":
                System.out.println("加油！");
                break;
            case "武汉":
                System.out.println("必胜！");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
