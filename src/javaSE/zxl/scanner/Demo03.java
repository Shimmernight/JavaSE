package javaSE.zxl.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //输入多个数字求平均数，回车确认，通过输入字母结束

        //定义
        int num = 0;
        double d = 0;

        //创建scanner
        Scanner scanner = new Scanner(System.in);

        //循环判断是否为数字
        while (scanner.hasNextDouble()){
            //用next接收
            d += scanner.nextDouble();
            num++;
            System.out.println("你输入第"+num+"个数据，当前和为："+d);
        }

        System.out.print(num+"个数的平均值为："+d/num);

        //建议创建的同时写关闭，以免忘记！
        scanner.close();
    }
}
