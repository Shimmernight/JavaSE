package javaSE.zxl.base;

public class 常量类型 {

    //属性：常量(不可改变)
    //关键词：final

    static final int a = 10;//静态常量
    public static void main(String[] args) {
        final double i = 100;//int类型自动转double类型
        System.out.println(i);

        //错误：a += 10;
        System.out.println(a);
    }
}
