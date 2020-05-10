package javaSE.zxl.struct;

public class SwitchDemo01 {

    static String grade = "A";

    public static void main(String[] args) {
        /**
         *  switch匹配一个具体的值
         */

        switch (grade) {
            case "A":
                System.out.println("优秀");
                break;
            case "B":
                System.out.println("良好");
                break;
            case "C":
                System.out.println("及格");
                break;
            case "D":
                System.out.println("不及格");
                break;
            default:
                System.out.println("输入不合法！");
                break;
        }
    }

}
