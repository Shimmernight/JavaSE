package javaSE.zxl.base;

public class 类型转换 {

    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i;
        double c = i;
        System.out.println(i);
        System.out.println(b);
        System.out.println(c);
        System.out.println("----------------------------");

        int money  = 10_0000_0000;
        int year = 20;
        System.out.println(money*year);//内存溢出
        //解决方法：
        long result = (long) money*year;
        System.out.println(result);
    }
}
