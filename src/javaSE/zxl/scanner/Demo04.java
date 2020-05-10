package javaSE.zxl.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        double d = 0;
        //实现一个简易的计算器    + - * /
        //获取控制台
        Scanner scanner = new Scanner(System.in);


        //循环判断
        do {
            System.out.print("请输入第一个数：");
            d = scanner.nextDouble();

            System.out.print("执行操作：");
            switch (scanner.next()) {
                case "add":
                    System.out.print("请输入第二个数：");
                    if (scanner.hasNextDouble()) {
                        d += scanner.nextDouble();
                    }
                    break;
                case "sub":
                    System.out.print("请输入第二个数：");
                    if (scanner.hasNextDouble()) {
                        d -= scanner.nextDouble();
                    }
                    break;
                case "mul":
                    System.out.print("请输入第二个数：");
                    if (scanner.hasNextDouble()) {
                        d *= scanner.nextDouble();
                    }
                    break;
                case "div":
                    System.out.print("请输入第二个数：");
                    if (scanner.hasNextDouble()) {
                        d /= scanner.nextDouble();
                    }
                    break;
            }
            System.out.println("运算结果为："+d);
        }while (!scanner.next().equals("q"));

        System.out.println("成功退出");
        scanner.close();
    }
}
