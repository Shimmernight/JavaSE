package houseWork.final关键词的应用;

public class final关键词的应用 {}
/**
 * 1.修饰类
 * 当用final修饰一个类时，表明这个类不能被继承。
 * 注：final类中的所有成员方法都会被隐式地指定为final方法。
 */
final class people{
}
//class Man extends people{ }

/**
 * 2.修饰方法
 * 禁止子类重写该方法才将方法设置为final的。
 * 注：类的private方法会隐式地被指定为final方法。
 */
class tree{
    final void getName(){}
}
class leaf extends tree{
    //void getName(){}//方法被final修饰，子类无法重写
}

/**
 * 3.修饰变量
 * 对于一个final变量，如果是基本数据类型的变量，则其数值一旦在初始化之后便不能更改；
 * 如果是引用类型的变量，则在对其初始化之后便不能再让其指向另一个对象。
 */
class num{
    final int i = 1;
    //i = 2;无法修改数值
    final Integer ig = 1;
    //ig = 1;无法指向另一个对象
}

//1.类的final变量和普通变量有什么区别？
class Test{
    public static void main(String[] args) {
        String a = "hello2";
        final String b = "hello";
        String c = "hello";
        String d = b+2;
        String e = c+2;

        System.out.println(a==d);//true
        System.out.println(a==e);//false
    }
    //final变量是基本数据类型以及String类型时，如果在编译期间能知道它的确切值，则编译器会把它当做编译期常量使用。
    //相当于直接访问的这个常量，不需要在运行时确定。
}
//2.final和static
class Test1 {
    public static void main(String[] args)  {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        System.out.println(myClass1.i);
        System.out.println(myClass1.j);
        System.out.println(myClass2.i);
        System.out.println(myClass2.j);

    }
}
class MyClass {
    public final double i = Math.random();
    public static double j = Math.random();
    //static作用于成员变量用来表示只保存一份副本，而final的作用是用来保证变量不可变。
}

