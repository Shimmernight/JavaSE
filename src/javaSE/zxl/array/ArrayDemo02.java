package javaSE.zxl.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //静态初始化
        int[] a = new int[]{1,2,3,4,5,6};
        System.out.println(a[0]);

        //动态初始化:包含了默认初始化
        int[] b = new int[10];
        b[0] = 10;
        System.out.println(b[0]);

    }
}
