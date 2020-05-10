package javaSE.zxl.method;

/**
 * 方法重载
 * 一个类的方法名相同，参数（个数、类型）不同
 */
public class Demo01 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int re = getMax(a, b);
        double re1 = getMax(12.2,10);
        System.out.println(re);
        System.out.println(re1);
    }

    private static int getMax(int a, int b) {
        return (a >= b) ? a : b;
    }

    private static double getMax(double a, double b) {
        return (a >= b) ? a : b;
    }
}
