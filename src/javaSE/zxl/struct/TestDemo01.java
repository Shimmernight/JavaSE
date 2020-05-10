package javaSE.zxl.struct;

public class TestDemo01 {
    /**
     * 打印三角形
     * 1.打印空格
     * 2.打印三角形
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
