package javaSE.zxl.struct;

import java.util.Scanner;

public class IfDemo02 {
    //if双选择结构
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        if (str.equals("a")){
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }

        scanner.close();
    }
}
