package javaSE.zxl.struct;

import java.util.Scanner;

//单if选择结构
public class IfDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        if (str.equals("hello")){
            System.out.println("执行了if里面");
        }

        System.out.println("if外面");

        scanner.close();
    }
}
