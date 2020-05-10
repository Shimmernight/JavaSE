package javaSE.oop.方法;

public class Demo02 {
    public static void main(String[] args) {
        //调用静态方法javaSE.javaSE.oop.方法
        int add = add(1, 2);
        System.out.println(add);
    }

    private static int add(int a, int b) {
        return a+b;
    }
}
