package javaSE.zxl.struct;

import java.util.Scanner;

public class IfDemo03 {
    //if多选择结构
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的成绩：");
        int score = scanner.nextInt();

        /**
         * 语句至多有一个else语句，并且在所有else if之后
         * 一旦else if为true，其他else if和else都将跳过
         */

        if (score==100){
            System.out.println("恭喜满分！");
        }else if (score<100 && score>=90){
            System.out.println("A级");
        }else if (score<90 && score>=80){
            System.out.println("B级");
        }else if (score<80 && score>=70){
            System.out.println("C级");
        }else if (score<70 && score>=60){
            System.out.println("D级");
        }else if (score<60 && score>=0){
            System.out.println("不合格");
        }else {
            System.out.println("成绩不合法！");
        }

        scanner.close();
    }
}
