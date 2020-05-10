package javaSE.zxl.method;

/**
 * 通过不断调用自身，到达边界时回溯的过程
 * 用到栈机制
 * 适用于次数少
 * 应尽量用其他方法替换递归！
 */

public class 递归 {

    public static void main(String[] args) {
        System.out.println(f(10));
    }

    /**
     * 1!   1*1
     * 2!   1*2
     * 3!   1*2*3
     */
    private static double f(double n) {
        if (n == 1) {
            return 1;
        } else {
            return n * f(n - 1);
        }

    }
}
