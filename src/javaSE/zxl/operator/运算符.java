package javaSE.zxl.operator;

public class 运算符 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);//出现丢失数据
        //方法：
        System.out.println(a/(double)b);

        double i = 234.1;
        long c = 234921874123123123L;
        int d = 1000;
        short e = 100;
        byte f = 10;
        System.out.println(i+c+d+e+f);//double
        System.out.println(c+d+e+f);//Long
        System.out.println(d+e+f);//Int
        System.out.println(e+f);//Int
        //有long型运算结果为long，有double结果为double，其余均为Int

    }
}
