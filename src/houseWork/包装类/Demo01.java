package houseWork.包装类;

public class Demo01 {
    public static void main(String[] args) {
        //手动装箱
        Integer x = new Integer(1);
        //自动装箱
        Integer y = 1;
        //手动拆箱
        int ax = x.intValue();
        //自动拆箱
        int ay = y;
        System.out.println("内存地址是否相等："+(x==y));//'=='比较的是内存地址
        System.out.println("值是否相等："+x.equals(y));

        //8个基本数据类型对应的包装类
        Byte b = 1;
        Integer i = 1;
        Short s = 1;
        Long l = 1L;
        Double d = 1.0;
        Float f = 1.0f;
        Boolean n = true;
        Character c = 'a';

        //1.基本类型转换成字符串类型
        String str;
        str = b.toString();//包装类 的toString()方法
        str = String.valueOf(b);//String 类的valueOf()方法
        str = ""+b;//空字符串加一个基本类型变量

        //2.字符串转换成基本类型
        int c1 = Integer.parseInt(str);//包装类的parse***()静态方法
        int c2 = Integer.valueOf(str);//包装类的valueOf()方法
        //因为存在自动装箱和自动拆箱，所以包装类型和基本类型一样

    }
}
