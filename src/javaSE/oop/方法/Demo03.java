package javaSE.oop.方法;

//java是值传递
public class Demo03 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        change(a);
        System.out.println(a);
    }

    private static void change(int a){
        a = 10;
    }
}