package javaSE.zxl.base;

public class 数据类型拓展问题 {

    public static void main(String[] args) {

        //========================================
        //整数拓展；二进制0b    八进制0    十六进制0x
        //========================================
        int i = 10;
        int i0 = 0b10;//二进制0b
        int i1 = 010;//八进制0
        int i2 = 0x10;//十六进制0x

        System.out.println(i);
        System.out.println(i0);
        System.out.println(i1);
        System.out.println(i2);

        //========================================
        //浮点型拓展：float 有限且离散，具有舍入误差
        //========================================
         /**
         * 最好不适用浮点数进行比较
         * 可用BigDecimal，数学工具类
         */
        // 问题1：
        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f==d);

        //问题2：
        float f1 = 2342332323223f;
        float f2 = f1+1;
        System.out.println(f2==f1);

        //========================================
        //字符拓展：所有字符本质还是数字
        //========================================
        char a = 'a';
        char b = '中';

        System.out.println(a);
        System.out.println((int) a);//强制转换
        System.out.println(b);
        System.out.println((int)b);//强制转换

        //转义字符
        //\t    制表符
        //\n    换行
        System.out.println("Hello\tWorld");

        //问题:
        String sa  = "a";
        String sb = "a";
        System.out.println(sa==sb);

        String sc = new String("a");
        String sd = new String("a");
        System.out.println(sc==sd);//内存分配

        //========================================
        //布尔拓展：less is more！
        //========================================
        boolean flag = true;
        if(flag==true){}
        if (flag){}//代码更精简已读
    }
}
