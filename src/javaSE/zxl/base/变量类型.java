package javaSE.zxl.base;

public class 变量类型 {
    //属性：变量
    //必须先定义再使用，并初始化
    //布尔型：默认值为false

    //3. 类变量(静态变量)
    static int c = 10;

    //2. 实例变量:从属于对象
    int b = 2;
    public static void main(String[] args) {
        //变量
        //1. 局部变量:从属于方法内
        int i = 100;
        System.out.println(i);
        System.out.println("--------------------");

        变量类型 m = new 变量类型();//通过实例对象访问实例变量
        System.out.println(m.b);
        System.out.println("--------------------");

        System.out.println(c);//直接调用类变量
    }
}
